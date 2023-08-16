public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        queue.display();
        queue.remove();      // it takes O(n) for removing , which is not good.   thats y we use Circular Queue.
        queue.display();
    }
}
