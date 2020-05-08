package com.greenfoxacademy.thereddit.controllers;

import com.greenfoxacademy.thereddit.models.Post;
import com.greenfoxacademy.thereddit.services.PostService;
import com.greenfoxacademy.thereddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {
  private PostService postService;
  private UserService userService;


  @Autowired
  public MainController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping(path = "/")
  public String redirectToHome() {
    return "redirect:/page/1";
  }

  @GetMapping(path = "/page/{page}")
  public String renderMainPage(@PathVariable int page, Model model) {
    model.addAttribute("user", userService.getCurrent());
    model.addAttribute("posts", postService.listTopTen(page));
    model.addAttribute("pages", postService.listPagination());
    return "index";
  }

  @GetMapping(path = "/submit")
  public String renderSubmitForm(Model model) {
    model.addAttribute("newpost", new Post());
    model.addAttribute("user_id", userService.getCurrent().getId());
    return "submit";
  }

  @PostMapping(path = "/submit")
  public String submitNewPost(@ModelAttribute Post newpost, long user_id) {
    postService.addPost(newpost, user_id);
    return "redirect:/";
  }

  @PostMapping(path = "/vote/")
  public String vote(long id, String vote) {
    postService.votePost(id, vote);
    return "redirect:/";
  }

  @PostMapping(path = "/loginform")
  public String switchLogin(String name, String logintype) {
    userService.loginForm(name, logintype);
    return "redirect:/";
  }

  @PostMapping(path = "/login")
  public String loginUser(String name) {
    userService.login(name);
    return "redirect:/";
  }

  @PostMapping(path = "/register")
  public String registerUser(String name) {
    userService.register(name);
    return "redirect:/";
  }

  @PostMapping(path = "/logout")
  public String loginUser(long id) {
    userService.logout(id);
    return "redirect:/";
  }
}
