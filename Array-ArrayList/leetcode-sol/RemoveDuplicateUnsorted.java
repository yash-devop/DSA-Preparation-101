import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateUnsorted {
    public static void main(String[] args) {
        // int[] arr = {11,2,3,14,14,14,14,5,5,6,6,6,6,8};
        // int[] arr = {3,8,1,2,4,10};
        int[] arr = {4,3,4,4,3};
        removeDuplicateUsingMap(arr);
        removeDuplicateUsingSet(arr);
       System.out.println(Arrays.toString(removeDuplicateUsingNewArray(arr)));
    }
    static void removeDuplicateUsingMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        // int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]) == false){
                map.put(arr[i], 1);
                // arr[j++] = 
            }
        }
        System.out.println(map.keySet());
    }
    static void removeDuplicateUsingSet(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
    }
    static int[] removeDuplicateUsingNewArray(int[] arr){
        int n = arr.length;
        int[] mark = new int[n];

        for (int i = 0; i < mark.length; i++) {
            mark[i] = 1;  // initial all true and assume true means unique.
        }

        // logic part
        int i=0;
        for (int j = 1; j < n-1; j++) {
            if(arr[i] == arr[j]){
                mark[i] = 0; // found dplicate turn it 0.
                i++;
            }
        }
        return mark;
    }
}
