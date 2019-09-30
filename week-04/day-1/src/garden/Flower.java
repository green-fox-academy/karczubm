package garden;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
    }

    @Override
    public void waterAbsorption(double water) {
        this.setWaterLevel(this.getWaterLevel() + water * 0.75);
        if (this.getWaterLevel()>7.5){
            this.setThirsty(false);
        }
    }

    @Override
    public String whenThirsty() {
        return this.getWaterLevel() < 7.5 ? "needs water" : "doesn't need water";
    }
}
