import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class validparanthesis {
    public static void main(String[] args) {
        String s = "[](){}";
        System.out.println(isValidParanthesis(s));

    }
    static boolean isValidParanthesis(String s){
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if(c == '('|| c =='{' || c=='['){
                 stack.push(c);
             }
             else{
                if(stack.empty()){
                    return false;
                }
                if(c==')' && stack.peek() == '('){
                    stack.pop();
                }
                else if(c=='}' && stack.peek() == '{'){
                    stack.pop();
                }
                else if(c==']' && stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;  //means that the element occured is different from the element already in the stack.
                }
             }
        }
        // if not , bydefault this will be returned.
        return stack.empty();  // returns true / false.
    }
}
