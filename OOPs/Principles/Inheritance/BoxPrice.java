package Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        // call the parent. i.e: BoxWeight
        // it will call the parent class constructor that has no parameters
        super();

        this.cost = -1;
    }
    public BoxPrice(double side, double weight, double cost) {
        // call the parent. it will call the parent class constructor that has side and weight as its parameters
        super(side,weight);

        // its own property.
        this.cost = cost;
    }
    public BoxPrice(double width, double height, double length, double weight, double cost) {
        super(width, height, length, weight);
        this.cost = cost;
    }

    
}
