package DoublyLinkedlist;

public class DoublyLinkedListeg {

    private Node head;
    private Node tail;
    private int size;

    void DoublyLinkedListeg() {
        this.size = 0;
    }

    private class Node {
        public int value;
        public Node next;
        public Node prev;

        public Node(int value) {
            this.value = value;
        }

    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        // head.prev = node;
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;

        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node findNode(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insert(int after, int value) {
        // find previous Node
        Node previousNode = findNode(after);
        if(previousNode == null){
            System.out.println("Doesnt exist");
            return;
        }
        Node node = new Node(value);
        node.next = previousNode.next;
        previousNode.next = node;
        node.prev = previousNode;
        if(node.next != null){
            node.next.prev = node;
        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "=>");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReversal() {
        Node temp = head;
        Node last = null;

        // loop to set Last to the end of the linkedlist.
        while (temp != null) {
            System.out.print(temp.value + "=>");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("print in reverse");
        while (last != null) {
            System.out.print(last.value + "=>");
            last = last.prev;
        }
        System.out.println("END");

    }

}
