package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String name) {
    long id = Greeting.atomicId.incrementAndGet();
    Greeting myGreeting = new Greeting(id, name);
    model.addAttribute("name", name);
    model.addAttribute("id", myGreeting.getId());
    model.addAttribute("size", "");
    return "greeting";
  }
}
