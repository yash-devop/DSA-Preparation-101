public class CircularQueue {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;
    int front = 0;
    int end = 0;
    int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size == data.length;  
    }
    public boolean isEmpty(){
        return size == 0;  
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end] = item;
        end = end % data.length;

        size++;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front = front % data.length;
        size--;
        front++;
        return removed;

    }
    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty !");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
        }
        
        int i = front;
        do{
            System.out.print(data[i] + "=> ");
            i++;
            i % data.length;
        }
        while(i ! = end);

        System.out.println("END");

    }
}
