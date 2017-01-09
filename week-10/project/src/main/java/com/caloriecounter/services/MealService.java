package com.caloriecounter.services;

import com.caloriecounter.models.Meal;
import com.caloriecounter.models.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by regnisalram on 1/9/17.
 */
@Service
public class MealService {

    private MealRepository mealRepository;

    @Autowired
    private TypeRepository typeRepository;

    @Autowired
    public MealService(MealRepository repository) {
        this.mealRepository = repository;
    }

//    @Autowired
//    public MealService(TypeRepository typeRepository) {
//        this.typeRepository = typeRepository;
//    }


    public Iterable<Meal> list() {
        return mealRepository.findAll();
    }

    public Iterable<Type> getTypes() {
        return typeRepository.findAll();
    }
}
