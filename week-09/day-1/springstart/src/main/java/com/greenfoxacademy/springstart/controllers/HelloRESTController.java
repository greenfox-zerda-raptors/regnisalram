package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by regnisalram on 12/19/16.
 */
@RestController
public class HelloRESTController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam("name") String name) {
        long id = counter.incrementAndGet();
        return new Greeting(id, "Hello, " + name + "!");
    }
}
