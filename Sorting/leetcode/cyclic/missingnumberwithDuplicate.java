package leetcode.cyclic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
// use the testCase from the above leetcode.
public class missingnumberwithDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclicSort(arr);

        List<Integer> list = new ArrayList<Integer>();  
        
        for (int i = 0; i < arr.length; i++) {
            if(i+1 != arr[i]){  // code for findng the missing elements...
                list.add(i+1);
                // System.out.println(i+1);
            }
        }
        System.out.println(list);
    }
    // same nothing new cyclicSort.
    static void cyclicSort(int[] arr ){
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;  // range [1 to N] else indexoutofbounds.
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
