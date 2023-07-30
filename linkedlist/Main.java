

public class Main{
    public static void main(String[] args) {
        linkedListeg list = new linkedListeg();  // size = 0 initially.

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(15);
        list.insertFirst(20);

        //
        list.insertAtLast(99);

        list.insertAtIndex(100,3);

        list.display();
    }
}