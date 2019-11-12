package com.example.restexerecises.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doubler implements Responsable {
    private int received;
    private int result;

    public Doubler(int received) {
        this.received = received;
    }

    public void doubling(int input) {
        this.result=input*2;
    }
}
