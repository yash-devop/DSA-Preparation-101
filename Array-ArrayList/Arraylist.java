import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        // or 
        // ArrayList<Integer> list = new ArrayList<Integer>();
        
        // 1
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.set(0,4);
        System.out.println(list);

        //get item at any index
        for (int i = 0; i < args.length; i++) {
            System.out.println(list.get(i));
        }
    }
}
