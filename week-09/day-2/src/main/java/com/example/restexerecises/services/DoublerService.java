package com.example.restexerecises.services;

import com.example.restexerecises.models.Doubler;
import org.springframework.stereotype.Service;

@Service
public class DoublerService {

    public Doubler doubling(int input) {
        Doubler doubler=new Doubler(input);
        doubler.doubling(input);
        return doubler;
    }
}
