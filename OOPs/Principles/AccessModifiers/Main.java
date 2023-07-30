package AccessModifiers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // need to do a few things:
        /*
             1. access the data members
             2. modify the data members.
             
             */
        A obj = new A(10,"yash");
        
        // data abstraction , private
        //      obj.num;  
        // ArrayList<Integer> list = new ArrayList<>();

        // the below is the data member that is present in the 
        // arraylist class : try ctrl+click on the Arraylist.
        
        //     list.DEFAULT_CAPACITY; 
        
        // using getter as we defined in class A.
        obj.getNum();

        String name = obj.name;  //working




    }
}
