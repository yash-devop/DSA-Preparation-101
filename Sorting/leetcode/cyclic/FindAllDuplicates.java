package leetcode.cyclic;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

// RANGE given : [1 to N]
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(cyclicSort(arr));
    }
    // same nothing new cyclicSort.
    static List<Integer> cyclicSort(int[] arr ){
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i < arr.length){
            int correctIndex = arr[i] - 1;  // range [1 to N] else indexoutofbounds.
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        // now adding the element inside the arraylist and return that.
        for (int index = 0; index < arr.length; index++) {  // traversing after sorting the array.
            if(arr[index] != index + 1){  
                list.add(arr[index]);  // adding the element.
            }
        }
        return list;
    }
    
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

