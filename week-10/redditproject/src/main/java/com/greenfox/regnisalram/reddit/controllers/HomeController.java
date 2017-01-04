package com.greenfox.regnisalram.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by regnisalram on 1/4/17.
 */
@Controller
@ResponseBody
@RequestMapping("/")
public class HomeController {

    @RequestMapping("")
    public String index(Model model) {
        return "Hello World!";
    }

}
