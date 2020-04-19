package com.greenfoxacademy.webshop.controllers;

import static java.lang.Math.round;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilterByPrice {
  @RequestMapping(value = "/filter-by-price", method = {RequestMethod.POST, RequestMethod.GET})
  public String renderMain(Model model, @RequestParam(required = false) String price,
                           @RequestParam(required = false) String submit) {

    double doublePrice;
    try {
      price.toLowerCase();
    } catch (NullPointerException e) {
      price = WebshopApplication.getLastPrice();
      submit = WebshopApplication.getLastSubmit();
    }
    try {
      if (WebshopApplication.getCurrency().equals("€")) {
        doublePrice = Double.parseDouble(price) / WebshopApplication.getCzkPerEur();
      } else {
        doublePrice = Double.parseDouble(price);
      }
    } catch (NumberFormatException e) {
      return "redirect:" + WebshopApplication.getCurrentController();
    }
    WebshopApplication.setLastPrice(price);
    WebshopApplication.setLastSubmit(submit);
    WebshopApplication.setCurrentController("/filter-by-price");
    List<ShopItem> listToRender = new ArrayList<>();
    if (submit.equals("above")) {
      listToRender = WebshopApplication.getMyShop().getItems().stream()
          .filter(item -> round(item.getPrice()) > round(doublePrice))
          .collect(Collectors.toList());
    } else if (submit.equals("below")) {
      listToRender = WebshopApplication.getMyShop().getItems().stream()
          .filter(item -> round(item.getPrice()) < round(doublePrice))
          .collect(Collectors.toList());
    } else if (submit.equals("exactly")) {
      listToRender = WebshopApplication.getMyShop().getItems().stream()
          .filter(item -> round(item.getPrice()) == round(doublePrice))
          .collect(Collectors.toList());
    }
    if (listToRender.size() == 0) {
      WebshopApplication.setParagraph("No items found " + submit + " " + price + " "
          + WebshopApplication.getCurrency());
    } else {
      WebshopApplication.setParagraph("Items " + submit + " " + price + " "
          + WebshopApplication.getCurrency() + ":");
    }
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", listToRender);
    return "more";
  }
}
