package Polymorphism;

public class Numbers {
    
       
    int sum(int a , int b){
        return a + b;
    }
    int sum(int a, int b , int c){
        return a + b;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(1,2);
        obj.sum(2, 3, 4);
        // obj.sum(4,5,6,7,8);
    }
}
