package AbstractDemo;

/*
 if a class contains 1 or more than 1
 abstract methods , that class itself should
 be declared as abstract .. thats y.. 
 */
abstract public class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }


    // abstract Parent(); // not able to create abstract constructors.

    abstract void career();
    abstract void partner();
}
