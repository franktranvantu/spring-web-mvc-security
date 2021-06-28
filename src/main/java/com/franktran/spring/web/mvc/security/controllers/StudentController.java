package com.franktran.spring.web.mvc.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  @GetMapping("/all-students")
  public String getAllStudents() {
    return "The list of students";
  }

  @GetMapping("/insert-student")
  public String insertStudent() {
    return "Inserted";
  }
}
