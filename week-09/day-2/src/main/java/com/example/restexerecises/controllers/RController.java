package com.example.restexerecises.controllers;

import com.example.restexerecises.models.*;
import com.example.restexerecises.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RController {

    @Autowired
    DoublerService doublerService;
    @Autowired
    ErrorService errorService;
    @Autowired
    GreeterService greeterService;
    @Autowired
    AppenderService appenderService;
    @Autowired
    DoUntilService doUntilService;
    @Autowired
    ArrayHandlerService arrayHandlerService;

    @GetMapping("/doubling")
    public ResponseEntity<Responsable> doubling(@RequestParam(required = false) Integer input) {
        if (input != null) {
            return ResponseEntity.status(HttpStatus.OK).body(doublerService.doubling(input));
        } else {
            errorService.getError().setError("Please provide an input!");
            return ResponseEntity.status(HttpStatus.OK).body(errorService.getError());
        }
    }

    @GetMapping("greeter")
    public ResponseEntity<Responsable> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name != null && title != null) {
            greeterService.getGreeter().setWelcomeMessage(name, title);
            return ResponseEntity.status(HttpStatus.OK).body(greeterService.getGreeter());
        } else if (name == null && title != null) {
            errorService.getError().setError("Please provide a name!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.getError());
        } else if (title == null && name != null) {
            errorService.getError().setError("Please provide a title!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.getError());
        } else {
            errorService.getError().setError("Please provide a name and a title!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.getError());
        }
    }

    @GetMapping("appenda/{appendable}")
    public ResponseEntity<Responsable> appender(@PathVariable("appendable") String appendable) {
        if (appendable != null) {
            return ResponseEntity.status(HttpStatus.OK).body(appenderService.appendA(appendable));
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("dountil/{action}")
    public ResponseEntity<Responsable> dountil(@RequestBody DoUntilDTO dto, @PathVariable String action) {
        switch (action) {
            case "sum":
                doUntilService.sum(dto.getUntil());
                return ResponseEntity.status(HttpStatus.OK).body(doUntilService.getDoUntil());
            case "factor":
                doUntilService.factor(dto.getUntil());
                return ResponseEntity.status(HttpStatus.OK).body(doUntilService.getDoUntil());
            default:
                errorService.getError().setError("Please provide a number!");
                return ResponseEntity.status(HttpStatus.OK).body(errorService.getError());
        }
    }

    @PostMapping("/arrays")
    public ResponseEntity<Responsable> arrayHandler(@RequestBody ArrayHandlerInputObject arrayHandler) {
        switch (arrayHandler.getWhat()) {
            case "sum":
                arrayHandlerService.sum(arrayHandler.getNumbers());break;
            case "multiply":
                arrayHandlerService.multiply(arrayHandler.getNumbers());break;
            case "double":
                arrayHandlerService.doubling(arrayHandler.getNumbers());
                 return ResponseEntity.status(HttpStatus.OK).body(arrayHandlerService.getArrayHandlerWtihAFuckingArray());
            default:
                errorService.getError().setError("Please provide what to do with the numbers!");
                return ResponseEntity.status(HttpStatus.OK).body(errorService.getError());
        }
        return ResponseEntity.status(HttpStatus.OK).body(arrayHandlerService.getArrayHandler());
    }
}
