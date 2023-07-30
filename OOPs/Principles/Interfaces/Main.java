package Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        // car.a;           // not able to access the item defined inthe subclass
        car.start();
        car.stop();
        car.brake();
        car.acc();
    
    }
}
