package com.greenfox.regnisalram.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by regnisalram on 1/4/17.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public String index() {
        return "redirect:/posts/";
    }

}
