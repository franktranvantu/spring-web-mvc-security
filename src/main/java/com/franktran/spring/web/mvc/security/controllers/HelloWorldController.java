package com.franktran.spring.web.mvc.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

  @GetMapping("/hello-world")
  public String helloWorld() {
    return "hello-world";
  }
}
