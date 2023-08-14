package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        // Circle circle = new Circle();
        Square square = new Square();

        shape.area();  // hey does shape has area constructor? yes it does.
        // circle.area();  // hey does circle has area constructor? yes it does.
        square.area();  // hey does circle has area constructor? yes it does.
    }
}
