package com.greenfoxacademy.springstart.controllers;

public class Greeting {
    private long greetCount;
    private String content;

    public Greeting(long greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public long getGreetCount() {
        return greetCount;
    }//ha nem egyezik a getter neve pontosan a get+fieldname-el elcsesződik a sorrend

    public String getContent() {
        return content;
    }
}
