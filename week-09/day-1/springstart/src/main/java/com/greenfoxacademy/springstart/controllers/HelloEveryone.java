package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

/**
 * Created by regnisalram on 12/19/16.
 */
@Controller
public class HelloEveryone {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"black", "silver", "gray", "maroon", "red", "purple", "fuchsia", "green", "lime", "olive", "yellow", "navy", "blue", "teal", "aqua"};
    private Random rand = new Random();

    @RequestMapping("/web/helloeveryone")
    public String helloEveryone(Model model) {
        model.addAttribute("hello", getHello(hellos));
        model.addAttribute("color", getColor(colors));
        model.addAttribute("font_size", getFontSize());

        return "greet_everyone";
    }

    public String getHello(String[] hellos) {
        return hellos[rand.nextInt(hellos.length)];
    }

    public String getColor(String[] colors) {
        return colors[rand.nextInt(colors.length)];
    }

    public int getFontSize() {
        return rand.nextInt(71) + 12;
    }
}

