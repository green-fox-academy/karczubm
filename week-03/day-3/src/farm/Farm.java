package farm;

import animal.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Farm {
    int numberOfSlots=10;
    int numberOfAnimals=0;
    List<Animal> animals=new ArrayList<>();

    public void breed(){
        animals.add(new Animal());
    }
    public void slaugther(){
        Collections.sort(animals);
        animals.remove(0);
        numberOfAnimals--;
    }
}
