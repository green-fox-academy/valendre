package com.greenfoxacademy.webshop.controllers;

import static java.lang.Math.round;

import com.greenfoxacademy.webshop.WebshopApplication;
import com.greenfoxacademy.webshop.models.ShopItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilterByPrice {
  @RequestMapping(value = "/filter-by-price", method = {RequestMethod.POST, RequestMethod.GET})
  public String renderMain(Model model, @RequestParam(required = false) Optional<String> optionalPrice,
                           @RequestParam(required = false) Optional<String> optionalSubmit) {

    double doublePrice;
    String price ="";
    String submit="";
    if ( optionalPrice.isPresent() ) {
      price = WebshopApplication.getLastPrice();
    } else {
      price = optionalPrice.toString();
    }
    if ( optionalSubmit.isPresent() ) {
      submit = WebshopApplication.getLastSubmit();
    } else {
      price = optionalSubmit.toString();
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
    switch (submit) {
      case "above":
        listToRender = WebshopApplication.getMyShop().getItems().stream()
            .filter(item -> round(item.getPrice()) > round(doublePrice))
            .collect(Collectors.toList());
        break;
      case "below":
        listToRender = WebshopApplication.getMyShop().getItems().stream()
            .filter(item -> round(item.getPrice()) < round(doublePrice))
            .collect(Collectors.toList());
        break;
      case "exactly":
        listToRender = WebshopApplication.getMyShop().getItems().stream()
            .filter(item -> round(item.getPrice()) == round(doublePrice))
            .collect(Collectors.toList());
        break;
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
