package LinkedListDemo;

public class Main {
    public static void main(String[] args) {
        linkedListeg list = new linkedListeg(); // size = 0 initially.

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(8);
        list.insertFirst(15);
        list.insertFirst(20);

        // //
        // list.insertAtLast(99);

        // list.insertAtIndex(100,3);
        // list.display();
        // System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.deleteIndex(3);
        System.out.println(list.findNode(20));
        list.display();
    }
}