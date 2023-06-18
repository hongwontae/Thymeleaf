package com.example.leaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.leaf.controller.leafEachController.User;

@Controller
public class leafConditionController {

    @GetMapping("leaf/leafCondition")
public String condition(Model model) {
    addUsers(model);
    return "/leaf/leafCondition";
}
//위에서 작성했던 메서드니 중복에 유의하자
private void addUsers(Model model) {
    List<User> users = Arrays.asList(new User("userA", 10),
            new User("userB", 20),
            new User("userC", 30));

    model.addAttribute("users", users);
}
    
}
