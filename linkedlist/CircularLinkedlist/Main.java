// package CircularLinkedlist;

public class Main {
    public static void main(String[] args) {
        CircularLinkedlisteg list = new CircularLinkedlisteg();
        list.insert(23);
        list.insert(4);
        list.insert(3);
        list.insert(19);
        list.insert(75);

        list.display();
        list.delete(19);
        list.display();
    }
}
