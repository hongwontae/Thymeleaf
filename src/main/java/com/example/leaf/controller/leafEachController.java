package com.example.leaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
@Controller
public class leafEachController {

@GetMapping("/leaf/leafEach")
public String each(Model model) {
    addUsers(model);
    return "/leaf/leafEach";
}

private void addUsers(Model model) {
    List<User> users = Arrays.asList(new User("userA", 10),
            new User("userB", 20),
            new User("userC", 30));
    
    model.addAttribute("users", users);
}

@GetMapping("/leaf/leafBlock")
public String block(Model model) {
    addUsers(model);
    return "/leaf/leafBlock";
}

@Data
@AllArgsConstructor
static class User{
    private String username;
    private int age;
}
    
}
