package com.example.leaf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/leaf/")
public class leafController {


    @GetMapping("leafList")
    public void getLeaf(Model model) {
        log.info("leaf....");
        model.addAttribute("data", "Hello Spring");        
    }

    @GetMapping("leafUnescape")
    public void getLeafUnescpae(Model model) {
        log.info("leaf....");
        model.addAttribute("data", "<b>Hello Spring</b>");        
    }

    @GetMapping("leafEl")
    public void getLeafEl(Model model) {
        log.info("leaf....");
        User userA = new User("userA", 10);
        User userB = new User("userB", 20);

        List<User> list = new ArrayList<>(Arrays.asList(userA, userB));

        Map<String, User> map = new HashMap<>();
        map.put("userA", userA);
        map.put("userB", userB);

        model.addAttribute("user", userA); //객체
        model.addAttribute("users", list); // list
        model.addAttribute("userMap", map); // map
    }
   
    @Data
    @AllArgsConstructor
    static class User{
        private String username;
        private int age;
    }

}
