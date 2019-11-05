package com.example.foxclub.services;

import com.example.foxclub.models.Fox;
import com.example.foxclub.repositories.Drinks;
import com.example.foxclub.repositories.Foods;
import com.example.foxclub.repositories.FoxRepo;
import com.example.foxclub.repositories.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxClubService {
    private FoxRepo repo;
    private Foods foods;
    private Drinks drinks;
    private Tricks tricks;

    @Autowired
    public FoxClubService(FoxRepo repo, Foods foods, Drinks drinks, Tricks tricks) {
        this.repo = repo;
        this.foods = foods;
        this.drinks = drinks;
        this.tricks = tricks;
    }

    public FoxRepo getRepo() {
        return repo;
    }

    public void changeFoxFood(String name, String food) {
        repo.getFoxes().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList()).get(0).setFood(food);
    }

    public void changeFoxDrink(String name, String drink) {
        repo.getFoxes().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList()).get(0).setDrink(drink);
    }

    public String getFoxName(String name) {
        return repo.getFoxes().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList()).get(0).getName();
    }

    public String getFoxFood(String name) {
        return repo.getFoxes().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList()).get(0).getFood();
    }

    public String getFoxDrink(String name) {
        return repo.getFoxes().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList()).get(0).getDrink();
    }

    public String getFoxTricksNumber(String name) {
        return Integer.toString(repo.getFoxes().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList()).get(0).getTricks().size());
    }

    public List<String> getFoxTricks(String name) {
        return repo.getFoxes().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList()).get(0).getTricks();
    }

    public List<String> getFoods() {
        return foods.getFoods();
    }

    public List<String> getDrinks() {
        return drinks.getDrinks();
    }

    public List<String> getTricks() {
        return tricks.getTricks();
    }

    public void teachFoxATrick(String name, String trick) {
        repo.getFoxes().stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList()).get(0).getTricks().add(trick);
    }

    public void addNewFox(String name) {
        repo.add(new Fox(name));
    }

    public boolean isFoxExists(String name) {
        return repo.getFoxes().stream().anyMatch(f -> f.getName().equals(name));
    }
}
