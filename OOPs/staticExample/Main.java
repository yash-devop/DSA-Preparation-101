package staticExample;

public class Main {
    public static void main(String[] args) {
        Human yash = new Human(20, "Yash", 30000, false);
        // Human rahul = new Human(24, "Rohan", 50000, true);

        System.out.println(yash.salary);
        System.out.println(Human.populatation);
    }
}
