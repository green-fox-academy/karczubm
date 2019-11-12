package com.example.restexerecises.services;

import com.example.restexerecises.models.ArrayHandler;
import com.example.restexerecises.models.ArrayHandlerWtihAFuckingArray;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;

@Service
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArrayHandlerService {
    ArrayHandler arrayHandler=new ArrayHandler();
    ArrayHandlerWtihAFuckingArray arrayHandlerWtihAFuckingArray=new ArrayHandlerWtihAFuckingArray();

    public void sum(int[] numbers) {
        int counter=0;
        for (int num:numbers) {
            counter+=num;
        }
        arrayHandler.setResult(counter);
    }
    public void multiply(int[] numbers) {
        int counter=1;
        for (int num:numbers) {
            counter*=num;
        }
        arrayHandler.setResult(counter);
    }
    public void doubling(int[] numbers) {
        int[]tmp=numbers;
        for (int i = 0; i < tmp.length; i++) {
            tmp[i]=numbers[i]*2;
        }
        arrayHandlerWtihAFuckingArray.setResult(tmp);
    }
}
