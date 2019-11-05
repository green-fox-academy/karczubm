package com.example.demodependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class Red implements MyColour {
    private Printer printer;

    @Autowired
    public Red(Printer printer) {
        this.printer=printer;
    }

    @Override
    public void printColour() {
        printer.log("It's red!");
    }
}
