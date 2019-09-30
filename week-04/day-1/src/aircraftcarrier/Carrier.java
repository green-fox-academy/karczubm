package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircrafts> carrier = new ArrayList<>();

    private int initialAmmo;
    private int currentAmmo;
    private int healthPoints;

    public Carrier(int initialAmmo, int healthPoints) {
        this.initialAmmo = initialAmmo;
        this.healthPoints = healthPoints;
    }

    public void add(Aircrafts aircraft) {
        carrier.add(aircraft);
    }

    public void fill() throws Exception {
        int counter = 0;
        for (Aircrafts aircrafts : carrier) {
            counter += aircrafts.getMaxAmmo();
        }

        if (counter <= currentAmmo && currentAmmo != 0) {
            for (Aircrafts ac : carrier) {
                currentAmmo = ac.refill(currentAmmo);
            }
        } else if (currentAmmo == 0) {
            throw new Exception("Out of ammo!");
        } else {
            !!!
        }
    }

    public void fight(Carrier enemy){
        int damage=0;
        for (Aircrafts ac:enemy.carrier) {
            damage+=ac.fight();
        }
        healthPoints-=damage;
    }
}
