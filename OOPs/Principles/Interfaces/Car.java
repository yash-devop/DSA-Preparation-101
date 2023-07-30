package Interfaces;

// public class Car extends Brake , Engine {            Multiple inheritance not supported.
    
// }

public class Car implements Engine , Brake{

    @Override
    public void brake() {

        System.out.println("I am Brake from Car!");
    }

    @Override
    public void start() {

        System.out.println("I am Start from Car!");
    }
    
    @Override
    public void stop() {
        
        System.out.println("I am Stop from Car !");
        
    }
    
    @Override
    public void acc() {
        
        System.out.println("I am accelerator from Car!");
    }

    
     



}
