package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Nutrition;
import com.greenfoxacademy.programmerfoxclub.models.Tricks;
import com.greenfoxacademy.programmerfoxclub.services.FoxInterface;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  FoxInterface foxList;

  @Autowired
  public MainController(FoxInterface foxList) {
    this.foxList = foxList;
  }

  @GetMapping(path = "/")
  public String renderHomepage(@RequestParam(required = false) Optional<String> name) {
    if (!name.isPresent()) {
      return "redirect:/login";
    }
    return "forward:/GO";
  }

  @GetMapping(path = "/login")
  public String renderLoginpage(Model model) {
    return "login";
  }

  @PostMapping(path = "/login")
  public String forwardLoginSwitcher(@RequestParam String name, @RequestParam String action) {
    return "forward:/" + action;
  }

  @RequestMapping(path = "/GO", method = {RequestMethod.GET, RequestMethod.POST})
  public String renderLogin(Model model, @RequestParam String name) {
    if (foxList.check(name)) {
      model.addAttribute("fox", foxList.get(name));
      return "index";
    }
    return "redirect:/login";
  }

  @PostMapping(path = "/Register")
  public String renderRegister(Model model, @RequestParam String name) {
    if (!foxList.check(name)) {
      foxList.add(name);
    }
    model.addAttribute("fox", foxList.get(name));
    return "index";
  }

  @GetMapping(path = "nutritionstore")
  public String renderNutritionStore(Model model, @RequestParam String name) {
    model.addAttribute("fox", foxList.get(name));
    model.addAttribute("foods", Nutrition.getFoodList());
    model.addAttribute("drinks", Nutrition.getDrinkList());
    return "nutritionstore";
  }

  @PostMapping(path = "/changenutrition")
  public String changeNutrition(@RequestParam(required = false) Optional<String> name,
                                @RequestParam String food, @RequestParam String drink) {
    if (!name.isPresent()) {
      return "redirect:/login";
    }
    if (foxList.check(name.get())) {
      foxList.get(name.get()).setFood(food);
      foxList.get(name.get()).setDrink(drink);
    }
    return "redirect:/?name=" + name.get();
  }

  @GetMapping(path = "/trickCenter")
  public String renderTrickCenter(@RequestParam(required = false) Optional<String> name, Model model) {
    if (!name.isPresent()) {
      return "redirect:/login";
    }
    model.addAttribute("fox", foxList.get(name.get()));
    List<String> toLearn = Tricks.getTrickList().stream()
        .filter(trick -> !foxList.get(name.get()).getTricks().contains(trick))
        .collect(Collectors.toList());
    model.addAttribute("tricks", toLearn);
    return "/trickcenter";
  }

  @PostMapping(path = "/learntricks")
  public String learnTricks(@RequestParam(required = false) Optional<String> name, @RequestParam String trick) {
    if (!name.isPresent()) {
      return "redirect:/login";
    }
    if (foxList.check(name.get())) {
      foxList.get(name.get()).addTrick(trick);
    }
    return "redirect:/?name=" + name.get();
  }
}
