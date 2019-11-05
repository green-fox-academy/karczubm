package com.example.demodependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemodependenciesApplication implements CommandLineRunner {

    private Printer printer;
    private MyColour colour;

    /*@Autowired
    public DemodependenciesApplication(Printer printer) {
        this.printer = printer;
    }*/
    public DemodependenciesApplication(@Qualifier("red") MyColour colour) {
        this.colour = colour;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemodependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        colour.printColour();
    }
}
