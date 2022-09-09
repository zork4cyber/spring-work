package com.zork.thymeSecure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping({ "/index", "/" })
    public String index() {
        return "index";
    }
}
