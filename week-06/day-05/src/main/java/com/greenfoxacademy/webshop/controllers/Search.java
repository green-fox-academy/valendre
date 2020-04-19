package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Search {
  @RequestMapping(value = "/search", method = RequestMethod.POST)
  public String renderMain(Model model, @RequestParam String search) {
    WebshopApplication.setCurrentController("/search");
    List<ShopItem> listToRender = WebshopApplication.getMyShop().getItems().stream()
        .filter(item -> item.getName().toLowerCase().contains(search.toLowerCase()) ||
            item.getDescription().toLowerCase().contains(search.toLowerCase()))
        .collect(Collectors.toList());
    if (listToRender.size() == 0) {
      WebshopApplication.setParagraph("No items found for " + search + ".");
    } else {
      WebshopApplication.setParagraph("Results for " + search + ":");
    }
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", listToRender);
    return "main";
  }
}
