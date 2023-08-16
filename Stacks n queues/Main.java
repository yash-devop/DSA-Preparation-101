import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws StackException {
        // CustomStack stack = new CustomStack(5);
        CustomStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(100);

        System.out.println(stack.peek());
        // System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
