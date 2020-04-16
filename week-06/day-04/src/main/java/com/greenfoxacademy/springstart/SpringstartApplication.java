package com.greenfoxacademy.springstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringstartApplication {


  @ResponseBody
  @RequestMapping(value="/hello")
  public String hello() {
    return "Hello world!";
  }


  public static void main(String[] args) {
    SpringApplication.run(SpringstartApplication.class, args);
  }


}
