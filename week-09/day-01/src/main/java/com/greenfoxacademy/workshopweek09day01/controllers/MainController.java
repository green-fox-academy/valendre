package com.greenfoxacademy.workshopweek09day01.controllers;

import com.greenfoxacademy.workshopweek09day01.domain.AppendA;
import com.greenfoxacademy.workshopweek09day01.domain.ArrayHandling;
import com.greenfoxacademy.workshopweek09day01.domain.DoUntil;
import com.greenfoxacademy.workshopweek09day01.domain.Doubling;
import com.greenfoxacademy.workshopweek09day01.domain.Error;
import com.greenfoxacademy.workshopweek09day01.domain.Greeter;
import com.greenfoxacademy.workshopweek09day01.domain.Until;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  @GetMapping("/")
  public String renderIndex() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public ResponseEntity<?> doubling(@RequestParam Optional<Integer> input) {
    if (input.isPresent()) {
      Doubling doubling = new Doubling(input.get());
      return ResponseEntity.ok().body(doubling);
    } else {
      return ResponseEntity.ok().body(new Error("Please provide an input!"));
    }
  }

  @GetMapping("/greeter")
  @ResponseBody
  public ResponseEntity<?> greet(@RequestParam Optional<String> name, @RequestParam Optional<String> title) {
    if (name.isPresent()) {
      if (title.isPresent()) {
        return ResponseEntity.ok().body(new Greeter(name.get(), title.get()));
      } else {
        return ResponseEntity.status(400).body(new Error("Please provide a title!"));
      }
    }
    return ResponseEntity.status(400).body(new Error("Please provide a name and a title!"));
  }

  @GetMapping("/appenda/{input}")
  @ResponseBody
  public ResponseEntity<?> appendA(@PathVariable Optional<String> input) {
    if (input.isPresent()) {
      return ResponseEntity.ok().body(new AppendA(input.get()));
    } else {
      return ResponseEntity.status(404).body(new Error("Not Found"));
    }
  }

  @PostMapping("/dountil/{operator}")
  @ResponseBody
  public ResponseEntity<?> doUntil(@RequestBody Until until, @PathVariable Optional<String> operator) {
    if (operator.isPresent() ) {
      return ResponseEntity.ok().body(new DoUntil(operator.get(), until.getUntil()));
    }
    return ResponseEntity.status(501).body(new Error("Bad request"));
  }

  @PostMapping("/arrays")
  @ResponseBody
  public ResponseEntity<?> handlingArray(@RequestBody Optional<ArrayHandling> arrayHandling) {
    if (arrayHandling.isPresent()) {
      if (arrayHandling.get().getWhat().equals("sum") || arrayHandling.get().getWhat().equals("multiply")) {
        return ResponseEntity.ok().body(arrayHandling.get().getResult());
      } else if (arrayHandling.get().getWhat().equals("double")) {
        return ResponseEntity.ok().body(arrayHandling.get().getResultArray());
      }
    }
    return ResponseEntity.ok().body(new Error("Please provide what to do with the numbers!"));
  }
}
