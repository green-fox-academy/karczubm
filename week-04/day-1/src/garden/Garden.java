package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants = new ArrayList<>();

    public Garden() {
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void info() {
        for (Plant plant : plants) {
            System.out.println("The " + plant.getColor() + " " + plant.getClass().getSimpleName() + " " + plant.whenThirsty());
        }
    }

    public void irrigation(double waterAmount) {
        int numberOfThirstyPlants=0;
        for (Plant plant: plants) {
            if (plant.isThirsty()){
                numberOfThirstyPlants++;
            }
        }
        for (Plant plant : plants) {
            if (plant.isThirsty())
                plant.waterAbsorption(waterAmount/numberOfThirstyPlants);
        }
    }
}
