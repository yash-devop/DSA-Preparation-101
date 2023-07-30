package AbstractDemo;

abstract public class Parent2 {

    int age;

    public Parent2(int age){
        this.age = age;
    }


    // abstract Parent(); // not able to create abstract constructors.

    abstract void career();
    abstract void partner();
}
