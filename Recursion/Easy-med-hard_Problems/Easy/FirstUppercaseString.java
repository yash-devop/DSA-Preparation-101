import java.util.*;
public class FirstUppercaseString {
    public static void main(String[] args) {
        String str = "geeksforgeeKs";
        // String str = "geeksForgeeKs";
        // String str = "geeksforgeekS";
        // String str = "geeksforgeeks";
        System.out.println(firstUpper(str,0));
    }
    static char firstUpper(String str,int index){
        if(index == str.length()){
            return '0';
        }
        if(Character.isUpperCase(str.charAt(index))){
            return str.charAt(index);
        }
        return firstUpper(str, ++index);
    }
}
