package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_world {

    @GetMapping("/Hellobro")
 public String Intro()
    {
      return "Hello world";
    }
}
