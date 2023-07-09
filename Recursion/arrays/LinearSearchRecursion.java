package arrays;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = { 1,5,9,12,12,15};
        // System.out.println(search(arr, 12, 0));
        // System.out.println(searchMultipleOccurence(arr, 12, 0));
        searchMultipleOccurence(arr, 12, 0);
        System.out.println(list);
    }
    static int search(int[] arr ,int target, int index){
        if(index == arr.length -1){
            return -1;
        }
        if(arr[index] != target){
            return search(arr, target, ++index);
        }
        else{
            return index;
        }
    }
    // Multiple occurence.
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchMultipleOccurence(int[] arr ,int target, int index){
        if(index == arr.length -1){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        searchMultipleOccurence(arr, target, ++index);
        
    }
}
