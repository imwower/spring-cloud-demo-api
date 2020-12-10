package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @GetMapping("/demo/list")
    public List<String> getList() {
        return Arrays.asList("abc", "def");
    }

    @GetMapping("/demo/currentUser")
    public User getCurrentUser(HttpServletRequest request) {
        User user = new User();
        String name = request.getHeader("user_name");
        user.setName(name);
        return user;
    }
}
