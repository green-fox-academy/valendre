package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AverageStock {
  @RequestMapping(value = "/average-stock")
  public String renderMain(Model model) {
    WebshopApplication.setCurrentController("/average-stock");
    WebshopApplication.setParagraph("Average stock: " +
        WebshopApplication.getMyShop().getItems().stream()
            .map(ShopItem::getQuantityOfStock)
            .mapToDouble(t -> Double.parseDouble(t.toString()))
            .average()
            .getAsDouble());
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", new ArrayList<>());
    return "main";
  }
}
