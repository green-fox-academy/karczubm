package com.example.restexerecises.services;

import com.example.restexerecises.models.DoUntil;
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
public class DoUntilService {
    DoUntil doUntil=new DoUntil();

    public void sum(int until){
        int counter=0;
        for (int i = 0; i <= until; i++) {
            counter+=i;
        }
        doUntil.setResult(counter);
    }
    public void factor(int until){
        int counter=1;
        for (int i = 1; i <= until; i++) {
            counter*=i;
        }
        doUntil.setResult(counter);
    }

}
