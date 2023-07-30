public class linkedListeg {
    
    /*
      head and tail are just the reference variables 
      this are just pointing to the nodes.
     */
    //in oops , we now default is NULL.
    private Node tail;
    private Node head;  
    private int size;

    //intially when we do linkedListeg list = new linkedListeg();
    // intially size = 0;
    public linkedListeg(){  
        this.size = 0;
    }

    // defining properties of the node.
    private class Node{

        private int value;  // value of the node (i.e box's value )
        private Node next;  // it just point to the next element.

        //  linkedListeg list = new linkedListeg();
        public Node(int value){
            this.value = value;
        }
        //  linkedListeg list = new linkedListeg(3,4);
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }

    // Insert the node .
    public void insertFirst(int val){

        // time complexity : O(1) constant

        // create a new box
        Node node = new Node(val);
        node.next = head;
         
        // head always point to the First Node.
        head = node;

        if(tail == null){
            // means that first item is being added.
            tail = head; // both head and tail are pointing to the same NODE>

        }
        size +=1;
    }

    public void insertAtLast(int val){
        // time complexity : O(1) constant
        if(tail == null){  // if tail is empty.
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1 ;
    }

    public void insertAtIndex(int val , int index){
        if(index == 0){  //basically means insertFirst()
            insertFirst(val);
            return;
        }
        if(index == size){
            insertAtLast(val);
            return;
        }

        Node temp = head;  // means start from head coz its first.

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next; // so this will stop behind the index , where you want to add.
        }

        // now add the new node (box)
        Node node = new Node(val , temp.next);
        temp.next = node;

        size += 1; // size++;
    } 

    // display
    public void display(){
        // time complexity : O(N)
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
