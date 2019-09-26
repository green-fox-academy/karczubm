package farm;

import animal.Animal;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Farm farm=new Farm();
        for (int i = 3; i < farm.numberOfSlots; i++) {
            farm.animals.add(new Animal());
            farm.numberOfAnimals++;
        }
        farm.animals.get(4).eat();
        farm.animals.get(3).eat();
        farm.animals.get(4).eat();
        Collections.sort(farm.animals);
        farm.slaugther();
        farm.breed();
    }
}
