package com.caloriecounter.controllers;

import com.caloriecounter.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by regnisalram on 1/2/17.
 */
@Controller
public class MainController {

    private MealService service;

    @Autowired
    public MainController(MealService service) {
        this.service = service;
    }

    @RequestMapping(value={"", "/"})
    public String index(Model model) {
        model.addAttribute("meals", service.list());
        return "main_page";
    }

    @GetMapping("/add")
    public String addMeal(Model model) {
        model.addAttribute("types", service.getTypes());
        return "add_meal";
    }

    @PostMapping("/create")
    public String createMeal() {
        return "redirect:/";
    }

}
