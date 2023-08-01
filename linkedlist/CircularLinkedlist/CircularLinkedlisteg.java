// package CircularLinkedlist;

public class CircularLinkedlisteg {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedlisteg(){
        this.head = null;
        this.tail=  null;
        this.size = 0;
    }

    private class Node{

        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }  
    }

    public void insert(int value){
        Node node = new Node(value);

        if(head == null){ // if the linkedlist is empty.
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value){
        Node temp = head;
        if(temp == null){  // means empty list.
            return;
        }

        if(temp.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node node = temp.next;
            if(node.value == value){
                temp.next = node.next;
                break;
            }
            temp = temp.next;
        }
        while(temp!=head);

    }




    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + "=>");
                temp = temp.next;
            }
            while(temp != head);
        }
        System.out.println("HEAD");
    }




}
