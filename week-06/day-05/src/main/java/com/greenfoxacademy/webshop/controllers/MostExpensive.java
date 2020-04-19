package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MostExpensive {
  @RequestMapping(value = "/most-expensive")
  public String renderMain(Model model) {
    WebshopApplication.setCurrentController("/most-expensive");
    Comparator<ShopItem> comparator = Comparator.comparing( ShopItem::getPrice );
    WebshopApplication.setParagraph("Most expensive: " +
        WebshopApplication.getMyShop().getItems().stream()
            .max(comparator)
            .get()
            .getName());
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", new ArrayList<>());
    return "main";
  }
}

