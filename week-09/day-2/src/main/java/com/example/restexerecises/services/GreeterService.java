package com.example.restexerecises.services;

import com.example.restexerecises.models.Greeter;
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
public class GreeterService {
    Greeter greeter=new Greeter();
}
