package com.example.demodependencies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class Green implements MyColour {

    @Override
    public void printColour() {
        System.out.println("I like green YO!");
    }
}
