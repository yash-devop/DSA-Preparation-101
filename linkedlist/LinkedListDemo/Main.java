package LinkedListDemo;

public class Main {
    public static void main(String[] args) {


        linkedListeg first = new linkedListeg();
        linkedListeg second = new linkedListeg();

        first.insertAtLast(1);
        first.insertAtLast(3);
        first.insertAtLast(5);
        second.insertAtLast(1);
        second.insertAtLast(2);
        second.insertAtLast(9);
        second.insertAtLast(14);

        linkedListeg ans = linkedListeg.merge(first, second);

        ans.display();



        // linkedListeg list = new linkedListeg(); // size = 0 initially.

        
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertFirst(8);
        // list.insertFirst(8);
        // list.insertFirst(15);
        // list.insertFirst(20);
        // list.insertFirst(20);
        // list.insertFirst(20);
        
        // System.out.println("Original Linkedlist:");
        // list.display();
        // // // //
        // // // list.insertAtLast(99);
        
        // // // list.insertAtIndex(100,3);
        // // // list.display();
        // // // System.out.println(list.deleteFirst());
        // // list.display();
        // // System.out.println(list.deleteLast());
        // // list.deleteIndex(3);
        // // System.out.println(list.findNode(20));
        
        
        // System.out.println("Insertion using Recursion in Linkedlist:");
        // // list.InsertRecursion(88, 1);
        // // list.display();
        // System.out.println("Remove duplicates in Linkedlist:");
        // list.removeDup();
        // list.display();
        

        

    }
}