package petrolstation;

public class Main {
    public static void main(String[] args) {
        Station station=new Station();
        Car car=new Car(30,60);
        station.refill(car);
    }
}
