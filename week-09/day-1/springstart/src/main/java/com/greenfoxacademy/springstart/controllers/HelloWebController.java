package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by regnisalram on 12/19/16.
 */
@Controller
public class HelloWebController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam("name") String name) {
        counter.incrementAndGet();
        model.addAttribute("name", name);
        model.addAttribute("counter", counter);
        return "greeting";
    }
}
