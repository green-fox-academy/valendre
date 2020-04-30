package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {
  private TodoRepository repository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public TodoController(TodoRepository repository, AssigneeRepository assigneeRepository) {
    this.repository = repository;
    this.assigneeRepository = assigneeRepository;
  }

  @GetMapping(path = {"/", "/list"})
  public String list(Model model) {
    List<Todo> activeTodos = new ArrayList<>();
    repository.findAll().forEach(activeTodos::add);
    model.addAttribute("todolist", activeTodos.stream().filter(todo -> !todo.isDone()).collect(Collectors.toList()));
    return "todolist";
  }

  @GetMapping(path = "/add")
  public String renderAddForm(Model model) {
    model.addAttribute("todo", new Todo());
    return "/add";
  }

  @PostMapping(path = "/add")
  public String addTodo(@ModelAttribute Todo todo) {
    repository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    repository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/{id}/edit")
  public String renderEditForm(Model model, @PathVariable long id) {
    model.addAttribute("todo", repository.findById(id));
    return "/edit";
  }

  @PostMapping(path = "/{id}/edit")
  public String addTodo(@ModelAttribute Todo todo, @PathVariable long id) {
    repository.save(todo);
    return "redirect:/todo/list";
  }

  @GetMapping(path = "/search")
  public String search(Model model, @RequestParam String search) {
    model.addAttribute("todolist", repository.findTodo(search));
    return "todolist";
  }

  @GetMapping(path = "/assignees")
  public String listAssignees(Model model) {
    model.addAttribute("assigneelist", assigneeRepository.findAll());
    model.addAttribute("new_assignee", new Assignee());
    return "assignee";
  }

  @PostMapping(path = "/addassignee")
  public String addAssignee(@ModelAttribute Assignee new_assignee) {
    assigneeRepository.save(new_assignee);
    return "redirect:/todo/assignees";
  }
}
