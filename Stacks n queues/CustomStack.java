public class CustomStack {
    int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;  // pointer


    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    // Push the Item inside the stack: 

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full !");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            // System.out.println("Stack is Empty !");
            // or
            throw new StackException("cannot pop because stack is empty !!");
        }
        int removed = data[ptr]; 
        ptr--;
        return removed;
            
    }
    public int peek() throws StackException{
        if(isEmpty()){
            // System.out.println("Stack is Empty !");
            // or
            throw new StackException("Cannot peek because stack is empty !!");
        }
        int topElement = data[ptr]; 
        return topElement;
            
    }
    public boolean isFull(){
        return ptr == data.length -1; // means that the ptr is at the end of the array and now we can't add the elements.
    }
    private boolean isEmpty(){
        return data.length == 0 || ptr == -1;
    }
}
