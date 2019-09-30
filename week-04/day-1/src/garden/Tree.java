package garden;

public class Tree extends Plant {

    public Tree(String color) {
        super(color);
    }

    @Override
    public void waterAbsorption(double water) {
        this.setWaterLevel(this.getWaterLevel() + water * 0.4);
        if (this.getWaterLevel()>10){
            this.setThirsty(false);
        }
    }

    @Override
    public String whenThirsty() {
        return this.getWaterLevel() < 10 ? "needs water" : "doesn't need water";

    }
}
