package com.caloriecounter.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by regnisalram on 1/2/17.
 */
@Entity
@Getter
@Setter
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Setter (AccessLevel.NONE)
    LocalDateTime dateEntered;

    LocalDate dateAdded;

    LocalTime timeAdded;

    @OneToOne
    Type typeOfFood;

    String description;
    int calories;

    Meal() {}

    public Meal(LocalDate dateAdded, LocalTime timeAdded, Type typeOfFood, String description, int calories) {
        this.dateEntered = LocalDateTime.now();
        this.dateAdded = dateAdded;
        this.timeAdded = timeAdded;
        this.typeOfFood = typeOfFood;
        this.description = description;
        this.calories = calories;
    }
}
