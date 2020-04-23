package com.greenfoxacademy.workshop.greenfoxclassapp.controllers;

import com.greenfoxacademy.workshop.greenfoxclassapp.services.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GfaController {
  StudentInterface studentInterface;

  @Autowired
  GfaController(StudentInterface studentInterface) {
    this.studentInterface = studentInterface;
  }

  @GetMapping(path = "/gfa")
  public String renderMain(Model model) {
    model.addAttribute("numberofstudent", studentInterface.count());
    return "gfa-main";
  }

  @GetMapping(path = "/gfa/list")
  public String renderStudentList(Model model) {
    model.addAttribute("list", studentInterface.findAll());
    return "gfa-list";
  }

  @GetMapping(path = "/gfa/add")
  public String renderAddStudent() {
    return "gfa-add";
  }

  @PostMapping(path = "/gfa/save")
  public String renderSaveStudent(@RequestParam String name) {
    studentInterface.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping(path = "/gfa/check")
  public String renderCheckStudent() {
    return "gfa-check";
  }

  @PostMapping(path = "/gfa/checker")
  public String renderCheckStudent(Model model, @RequestParam String name) {
    model.addAttribute("paragraph", studentInterface.check(name));
    return "gfa-checker";
  }
}
