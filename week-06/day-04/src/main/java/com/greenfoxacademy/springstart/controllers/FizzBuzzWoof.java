package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FizzBuzzWoof {
  private static AtomicLong Counter = new AtomicLong();

  @RequestMapping("/web/fizzbuzzwoof")
  public String makeFizzBuzzWoof(Model model, @RequestParam String name) {
    String idString = "";
    int fizzCounter =0;
    long id = Counter.incrementAndGet();
    String size = "";

    if (id%3==0){
      idString +="Fizz";
      fizzCounter++;
    }
    if (id%5==0){
      idString +="Buzz";
      fizzCounter++;
    }
    if (id%7==0){
      idString +="Woof";
      fizzCounter++;
    }
    if (idString == "") {
      idString += id;
    }
    if (fizzCounter!=0) {
      size="font-size: " + (fizzCounter*24) + "px;";
    }
    Greeting myGreeting = new Greeting(id, name);
    model.addAttribute("name", name);
    model.addAttribute("id", idString);
    model.addAttribute("size", size);
    return "greeting";
  }
}
