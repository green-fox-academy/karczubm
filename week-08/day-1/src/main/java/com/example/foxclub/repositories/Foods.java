package com.example.foxclub.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Foods {
    private List<String> foods=new ArrayList<>();

    public Foods() {
        foods.add("tajim");
        foods.add("salad");
        foods.add("véreshurka");
        foods.add("bread");
        foods.add("cheese");
    }

    public List<String> getFoods() {
        return foods;
    }
}
