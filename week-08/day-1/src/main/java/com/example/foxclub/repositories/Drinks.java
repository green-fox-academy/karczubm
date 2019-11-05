package com.example.foxclub.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Drinks {
    private List<String> drinks=new ArrayList<>();

    public Drinks() {
        drinks.add("apple juice");
        drinks.add("beer");
        drinks.add("pálinka");
        drinks.add("milk");
        drinks.add("water");
    }

    public List<String> getDrinks() {
        return drinks;
    }

}
