package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxInterface;
import com.greenfoxacademy.programmerfoxclub.services.FoxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  FoxInterface foxList;

  @Autowired
  public MainController(FoxInterface foxList) {
    this.foxList = foxList;
  }

  @GetMapping(path = "/")
  public String renderHomepage() {
    return "/index";
  }

  @GetMapping(path = "/login")
  public String renderLoginpage(Model model) {
    return "/login";
  }

  @PostMapping(path = "/login")
  public String forwardLoginSwitcher(@RequestParam String name, @RequestParam String action) {
    return "forward:/" + action;
  }

  @PostMapping(path = "/GO")
  public String renderLogin(@RequestParam String name) {
    System.out.println(name);
    return "index";
  }

  @PostMapping(path = "/Register")
  public String renderRegister(@RequestParam String name) {
    System.out.println(name);
    return "index";
  }
}
