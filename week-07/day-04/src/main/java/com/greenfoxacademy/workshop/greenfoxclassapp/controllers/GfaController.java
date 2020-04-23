package com.greenfoxacademy.workshop.greenfoxclassapp.controllers;

import com.greenfoxacademy.workshop.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GfaController {
  StudentService studentService;

  @Autowired
  GfaController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping(path = "/gfa")
  public String renderMain(Model model) {
    model.addAttribute("numberofstudent", studentService.count());
    return "gfa-main";
  }

  @GetMapping(path = "/gfa/list")
  public String renderStudentList(Model model) {
    model.addAttribute("list", studentService.findAll());
    return "gfa-list";
  }

  @GetMapping(path = "/gfa/add")
  public String renderAddStudent() {
    return "gfa-add";
  }

  @PostMapping(path = "/gfa/save")
  public String renderSaveStudent(@RequestParam String name) {
    studentService.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping(path = "/gfa/check")
  public String renderCheckStudent() {

return "gfa-check";
  }
}
