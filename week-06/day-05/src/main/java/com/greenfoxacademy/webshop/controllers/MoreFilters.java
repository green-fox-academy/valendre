package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoreFilters {

  @RequestMapping(value="/more-filters")
  public String renderMain(Model model){
    WebshopApplication.setCurrentController("/more-filters");
    WebshopApplication.setParagraph("");
    model.addAttribute("czkpereur", WebshopApplication.getCzkPerEur());
    model.addAttribute("currency", WebshopApplication.getCurrency());
    model.addAttribute("paragraph", WebshopApplication.getParagraph());
    model.addAttribute("items", WebshopApplication.getMyShop().getItems());
    return "more";
  }
}

