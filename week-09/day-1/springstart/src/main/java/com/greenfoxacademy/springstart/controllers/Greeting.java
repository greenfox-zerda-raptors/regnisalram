package com.greenfoxacademy.springstart.controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by regnisalram on 12/19/16.
 */
@Getter
@AllArgsConstructor
public class Greeting {

    long id;
    String content;

}
