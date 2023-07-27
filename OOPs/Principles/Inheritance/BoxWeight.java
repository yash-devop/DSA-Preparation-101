package Inheritance;

// basically it want all the properties that are in the BoxClass.

public class BoxWeight extends Box{ //public class BoxWeight extends Box means Boxweight is child and Box is parent
    double weight;
    
    // Boxweight own property.
    public BoxWeight(){
         this.weight = -1;
    }


    // im calling it from the Box.java
    public BoxWeight(double side, double weight){
          // get the parent property. 
         super(side);  // what is this super ? means it saying call the parent class Contructor.

         // its own property.  
         this.weight = weight;
    }



    public BoxWeight(double width,double height , double length , double weight){
          // get the parent property. 
         super(width , height , length);  // what is this super ? means it saying call the parent class Contructor.
         
         //its own property
         this.weight = -1;

         System.out.println(super.weight);
    }
}
