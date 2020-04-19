package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CheapestFirst {
  @RequestMapping(value = "/cheapest-first")
  public String renderMain(Model model) {
    WebshopApplication.setCurrentController("/cheapest-first");
    List<ShopItem> listToRender = WebshopApplication.getMyShop()
        .getItems()
        .stream()
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList());

    WebshopApplication.setParagraph("");
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", listToRender);
    return "main";
  }
}

