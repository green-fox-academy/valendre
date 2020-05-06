package com.greenfoxacademy.workshopweek09day01.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.greenfoxacademy.workshopweek09day01.domain.Log;
import com.greenfoxacademy.workshopweek09day01.domain.LogResponse;
import com.greenfoxacademy.workshopweek09day01.domain.Until;
import com.greenfoxacademy.workshopweek09day01.services.ArrayService;
import com.greenfoxacademy.workshopweek09day01.services.ExerciseService;
import com.greenfoxacademy.workshopweek09day01.services.LogService;
import com.greenfoxacademy.workshopweek09day01.services.SithService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  private ExerciseService exerciseService;
  private ArrayService arrayService;
  private LogService logService;
  private SithService sithService;

  @Autowired
  public MainController(ExerciseService exerciseService, ArrayService arrayService,
                        LogService logService, SithService sithService) {
    this.exerciseService = exerciseService;
    this.arrayService = arrayService;
    this.logService = logService;
    this.sithService = sithService;
  }

  @GetMapping("/")
  public String renderIndex() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public ResponseEntity<?> doubling(@RequestParam Optional<Integer> input) {
    logService.addLog(new Log("/doubling", "?input=" + input));
    return exerciseService.doubling(input);
  }

  @GetMapping("/greeter")
  @ResponseBody
  public ResponseEntity<?> greet(@RequestParam Optional<String> name, @RequestParam Optional<String> title) {
    logService.addLog(new Log("/greeter", "?name=" + name + "&title=" + title));
    return exerciseService.greet(name, title);
  }

  @GetMapping("/appenda/{input}")
  @ResponseBody
  public ResponseEntity<?> appendA(@PathVariable Optional<String> input) {
    logService.addLog(new Log("/appenda", "/appenda/" + input));
    return exerciseService.appendA(input);
  }

  @PostMapping("/dountil/{operator}")
  @ResponseBody
  public ResponseEntity<?> doUntil(@RequestBody String allParams, @PathVariable Optional<String> operator) throws JsonProcessingException {
    //logService.addLog(new Log("/dountil", "/dountil/" + operator+ ", {\"unłtil\":"+until+"}"));
    return exerciseService.doUntil(allParams, operator);
  }

  @PostMapping("/arrays")
  @ResponseBody
  public ResponseEntity<?> handlingArray(@RequestBody String allParams) {
    logService.addLog(new Log("/arrays", allParams));
    return arrayService.handlingArray(allParams);
  }

  @GetMapping("/log")
  @ResponseBody
  public ResponseEntity<?> logResponse() {
    return ResponseEntity.ok().body(new LogResponse(logService.getAllLogs()));
  }

  @PostMapping("/sith")
  @ResponseBody
  public ResponseEntity<?> responseSith(@RequestBody String allParams) {
    logService.addLog(new Log("/sith", allParams));
    return sithService.responseSith(allParams);
  }
}
