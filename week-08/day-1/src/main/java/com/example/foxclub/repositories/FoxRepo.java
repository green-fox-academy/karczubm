package com.example.foxclub.repositories;

import com.example.foxclub.models.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoxRepo {
    List<Fox> foxes=new ArrayList<>();

    public FoxRepo() {
        foxes.add(new Fox ("Minta"));
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void add(Fox fox) {
        foxes.add(fox);
    }
}
