package com.example.firstMaven.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("input")
public class MainController {

    @GetMapping
    public String getInput(@RequestParam("id") int a) {
        String string = "input " + a;
        return string;
    }
}