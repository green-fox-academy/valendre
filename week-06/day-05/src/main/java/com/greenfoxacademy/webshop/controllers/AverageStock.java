package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.ArrayList;
import java.util.OptionalDouble;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AverageStock {
  @RequestMapping(value = "/average-stock")
  public String renderMain(Model model) {
    WebshopApplication.setCurrentController("/average-stock");
    OptionalDouble optionalAverage =
        WebshopApplication.getMyShop().getItems().stream()
            .map(ShopItem::getQuantityOfStock)
            .mapToDouble(t -> Double.parseDouble(t.toString()))
            .average();
    if (optionalAverage.isPresent()) {
      WebshopApplication.setParagraph("Average stock: " + optionalAverage);
    } else {
      WebshopApplication.setParagraph("No data to calculate average stock.");
    }
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", new ArrayList<>());
    return "main";
  }
}
