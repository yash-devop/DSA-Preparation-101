package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    static int populatation;

    // contructors
    public Human(int age, String name , int salary , boolean isMarried){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.populatation += 1;
    }
}
