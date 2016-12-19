package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by regnisalram on 12/19/16.
 */
@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    public Greeting greeting() {
        return new Greeting(1, "Hello");
    }
}
