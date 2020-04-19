package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.WebshopApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CurrencyEuro {

  @RequestMapping(value="/euro")
  public String renderMain(){
    WebshopApplication.setCurrency("€");
    return "redirect:" + WebshopApplication.getCurrentController();
  }
}

