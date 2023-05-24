import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 

        /*  initially its empty , so if we dont initialize it,
            it will say , hey you are saying , get(i) and add , but in which list bro ?
            so, first initialize then do the rest of the Operations.
        */
        
        // initializing like : int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // adding arraylist inside the main arrayList
        }

        // add elements
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
                /* get(i) method means get the list at that index. */
            }
        }
        //printing.
        System.out.println(list);

        sc.close();
    }
}
