package com.greenfox.finder.controller;

import service.UserService;
import com.greenfox.finder.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping(value = "/app")
public class AppController {

    @Autowired
    UserService service;

    @GetMapping(path = "/")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
        System.out.println("ffdsf");
        return "main";
    }

    @PostMapping(path = "/app")
    public String create() {
        service.save(new User());
        return "redirect:/";
    }
}