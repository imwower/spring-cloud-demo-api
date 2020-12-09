package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AdminController {

    @GetMapping("/admin")
    public List<String> getList() {
        return Arrays.asList("admin", "admin2");
    }
}
