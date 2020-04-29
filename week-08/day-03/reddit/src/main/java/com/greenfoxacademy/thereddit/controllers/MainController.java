package com.greenfoxacademy.thereddit.controllers;

import com.greenfoxacademy.thereddit.models.Post;
import com.greenfoxacademy.thereddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  PostService postService;

  @Autowired
  public MainController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping(path = "/")
  public String redirectToHome() {
    return "redirect:/page/0";
  }

  @GetMapping(path = "/page/{page}")
  public String renderPage(@PathVariable int page, Model model) {
    model.addAttribute("posts", postService.listTopTen(page));
    return "index";
  }

  @GetMapping(path = "/submit")
  public String renderSubmitForm(Model model) {
    model.addAttribute("newpost", new Post());
    return "submit";
  }

  @PostMapping(path = "/submit")
  public String submitNewPost(@ModelAttribute Post newpost) {
    postService.addPost(newpost);
    return "redirect:/";
  }

  @PostMapping(path = "/vote/")
  public String vote(@RequestParam long id, @RequestParam String vote) {
    postService.votePost(id, vote);
    return "redirect:/";
  }

}
