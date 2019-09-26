package petrolstation;

public class Station {
    int gasAmount=1000;
    public void refill(Car car){
        gasAmount-=car.capacity-car.gasAmount;
        car.gasAmount=car.capacity;
    }
}
