package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ItemType;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilterByType {

  @RequestMapping(value = "/filter-by-type")
  public String renderMain(Model model, @RequestParam String type) {
    ItemType itemType;
    switch (type) {
      case "clothes-and-shoes":
        itemType = ItemType.CLOTHES;
        WebshopApplication.setParagraph("Only clothes and shoes:");
        break;
      case "electronics":
        WebshopApplication.setParagraph("Only electronis:");
        itemType = ItemType.ELECTRONIC;
        break;
      case "beverages-and-snacks":
        WebshopApplication.setParagraph("Only beverages and snacks:");
        itemType = ItemType.SNACK;
        break;
      default:
        return "redirect:" + WebshopApplication.getCurrentController();
    }
    WebshopApplication.setCurrentController("/filter-by-type?type=" + type);
    List<ShopItem> listToRender = WebshopApplication.getMyShop().getItems().stream()
        .filter(clothes -> clothes.getType() == itemType)
        .collect(Collectors.toList());
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", listToRender);
    return "more";
  }
}
