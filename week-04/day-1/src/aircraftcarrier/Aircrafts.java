package aircraftcarrier;

public class Aircrafts {

    int ammo=0;
    private int baseDamage;
    private int maxAmmo;
    private boolean prioity;

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public boolean isPrioity() {
        return prioity;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public int fight(){
        int totalDamage=ammo*baseDamage;
        ammo=0;
        return totalDamage;
    }
    public int refill(int baseAmmo) {
        ammo=maxAmmo;
        return baseAmmo-maxAmmo;
    }
    public String getType(){
        return this.getClass().getSimpleName();
    }
    public String getInfo(){
        String info="Type"+getType()+", Ammo: "+getAmmo()+", Base Damage: "+getBaseDamage()+", All Damage:"+getAmmo()*getBaseDamage();
        return info;
    }
    public boolean isPriority(){
        return prioity;
    }
}
