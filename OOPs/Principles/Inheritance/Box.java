package Inheritance;
public class Box {
    double length;
    double height;
    double width;
    double weight;
    String alpha;

    Box() {  // Box box = new Box();
        this.height = -1;
        this.length= -1;
        this.width= -1;
    }
    // cube

    Box(double side) { // Box box = new Box(5);
        this.width = side;
        this.height= side;
        this.length= side;
    }

    Box(double width,double height , double length) { // Box box = new Box(2,3,4);
        this.width = width;
        this.height= height;
        this.length= length;
    }


    Box(Box oldBox){  // copy constructor  : oldBox is random variable , it ccpies the type of old one and pass it to the new.
        /*
            Box box1 = new Box();
            Box box2 = box1;
        */
        this.height = oldBox.height;
        this.width= oldBox.width;
        this.length= oldBox.length;
    }

    public void information(){
        System.out.println("Running the box");
    }
}