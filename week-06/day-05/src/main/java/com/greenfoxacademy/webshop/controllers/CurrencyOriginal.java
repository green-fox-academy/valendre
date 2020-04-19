package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CurrencyOriginal {

  @RequestMapping(value = "/original-currency")
  public String renderMain() {
    WebshopApplication.setCurrency("Kč");
    return "redirect:" + WebshopApplication.getCurrentController();
  }
}