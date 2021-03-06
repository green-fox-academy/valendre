package com.greenfoxacademy.listingtodosh2.controllers;

import com.greenfoxacademy.listingtodosh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {
  private TodoRepository repository;

  @Autowired
  public TodoController(TodoRepository repository) {
    this.repository = repository;
  }

  @GetMapping(path = {"/", "/list" })
  public String list(Model model) {
    model.addAttribute("todolist", repository.findAll());
    return "todolist";
  }
}
