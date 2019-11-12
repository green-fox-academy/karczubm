package com.example.restexerecises.services;

import com.example.restexerecises.models.Appender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppenderService {
    Appender appender=new Appender();
    public Appender appendA(String string){
        appender.appendA(string);
        return appender;
    }
}
