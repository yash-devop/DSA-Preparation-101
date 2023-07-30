package differentPackage;

import AccessModifiers.A;

public class Subclass extends A{

    public Subclass(int num, String name) {
        super(num, name); // go and call the constructor of A class.
    }

    public static void main(String[] args) {
        // A obj  = new A(0, "yash");
        // int n = obj.num;  // not accessible bcoz num in A class is protected.
        Subclass obj  = new Subclass(10, "yash");

        int n = obj.num;  // not accessible bcoz num in A class is protected.
        System.out.println(n);
        
    }

}
