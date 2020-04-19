package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContainsNike {
  @RequestMapping(value = "/contains-nike")
  public String renderMain(Model model) {
    WebshopApplication.setCurrentController("/contains-nike");
    String stringToSearch = "nike";
    List<ShopItem> listToRender = WebshopApplication.getMyShop().getItems().stream()
        .filter(item -> item.getName().toLowerCase().contains(stringToSearch)
            || item.getDescription().toLowerCase().contains(stringToSearch))
        .collect(Collectors.toList());
    WebshopApplication.setParagraph("");
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", listToRender);
    return "main";
  }
}