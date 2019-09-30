package garden;

public class Plant {
    private String color;
    private double waterLevel=0;
    private boolean isThirsty=true;

    public boolean isThirsty() {
        return isThirsty;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setThirsty(boolean thirsty) {
        isThirsty = thirsty;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public String getColor() {
        return color;
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public Plant(String color){
        this.color=color;
    }

    public void waterAbsorption(double water){
        waterLevel+=water;
    }
    public String whenThirsty(){
        return "";
    }
}
