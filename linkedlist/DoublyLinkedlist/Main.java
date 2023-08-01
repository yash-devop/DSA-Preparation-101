package DoublyLinkedlist;

public class Main{
    public static void main(String args[]){
        DoublyLinkedListeg list = new DoublyLinkedListeg();
        list.insertFirst(10);
        list.insertFirst(20);

        list.display();
        list.displayReversal();
        
        
        list.insertLast(99);
        list.display();
        
        list.insert(20, 65);
        list.display();
    }
}