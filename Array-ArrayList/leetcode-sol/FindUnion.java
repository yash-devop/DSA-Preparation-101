import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class FindUnion {
    public static void main(String[] args) {
        int[] arr1 = { 2,2,3,4,5};
        int[] arr2 = {1,1,2,3,4};
       System.out.println(union(arr1, arr2));
       System.out.println(unionUsingMap(arr1, arr2));
    }
    // using HashSet
    static ArrayList<Integer> union(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        
        // addin the element to the hashset.
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        //adding the element to the hashset
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        // adding the element into the ArrayList
        for(int it : set){
            Union.add(it);
        }
        // System.out.println(set);
        return Union;
    }

    
    // Using HashMap
    static ArrayList<Integer> unionUsingMap(int[] arr1,int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i],0)+1);
        }
        for (int j = 0; j < arr2.length; j++) {
            map.put(arr2[j], map.getOrDefault(arr2[j],0)+1);
        }
        for(int it : map.keySet()){
            Union.add(it);
        }
        return Union;
    }
}
