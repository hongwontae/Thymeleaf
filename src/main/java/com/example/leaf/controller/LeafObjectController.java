package com.example.leaf.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/leaf")
public class LeafObjectController {

    @GetMapping("/leafObject")
    public String leafObject(HttpSession httpSession) {
    httpSession.setAttribute("sessionData", "Hello Session");
    return "/leaf/leafObject";
    }

    @Component("helloBean")
    static class HelloBean{
        public String hello(String data) {
            return "Hello " + data;
        }
    }

    
}
