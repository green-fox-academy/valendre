package com.greenfoxacademy.workshop.utilityservice.controllers;

import com.greenfoxacademy.workshop.utilityservice.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  UtilityService utilityService;

  @Autowired
  public MainController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping(path = "/useful")
  public String renderUseful() {
    return "useful";
  }

  @GetMapping(path = "/useful/colored")
  public String renderColored(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping(path = "/useful/email")
  public String renderEmailValidator(Model model, @RequestParam String email) {
    String paragraph = "";
    String color = "";
    if (utilityService.validateEmail(email)) {
      paragraph = email + " is a valid email address";
      color = "green";
    } else {
      paragraph = email + " is not a valid email address";
      color = "red";
    }
    model.addAttribute("paragraph", paragraph);
    model.addAttribute("color", color);
    return "email";
  }

  @GetMapping(path = "/useful/caesarencoding")
  public String renderCaesarEncoding(Model model, @RequestParam String text, @RequestParam int number) {
    model.addAttribute("text", utilityService.caesar(text, number));
    return "caesar";
  }

  @GetMapping(path = "/useful/caesardecoding")
  public String renderCaesarDecoding(Model model, @RequestParam String text, @RequestParam int number) {
    model.addAttribute("text", utilityService.caesar(text, -number));
    return "caesar";
  }
}
