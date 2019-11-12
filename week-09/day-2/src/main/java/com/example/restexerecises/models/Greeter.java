package com.example.restexerecises.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Greeter implements Responsable {
    private String welcome_message;

    public void setWelcomeMessage(String name,String title){
        this.welcome_message = "Oh, hi there "+name+", my dear "+title+"!";

    }
}
