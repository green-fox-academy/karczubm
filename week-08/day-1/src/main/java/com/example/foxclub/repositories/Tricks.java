package com.example.foxclub.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Tricks {
private List<String> tricks=new ArrayList<>();

    public Tricks() {
        tricks.add("write html");
        tricks.add("style with css");
        tricks.add("disznóvágás");
        tricks.add("play the guitar");
        tricks.add("understand spring");
    }
    public List<String> getTricks(){
        return tricks;
    }

}
