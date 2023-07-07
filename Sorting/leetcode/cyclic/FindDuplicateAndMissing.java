package leetcode.cyclic;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
public class FindDuplicateAndMissing {
    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
    // same nothing new cyclicSort.
    static int[] cyclicSort(int[] arr ){
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
        // now adding the element inside the arraylist and return that.
        for (int index = 0; index < arr.length; index++) {  // traversing after sorting the array.
            if(arr[index] != index + 1){  
                // we know that one number is missing from the array, and one number is repeating number.
                // so , missing number will be index + 1;
                // notice : If all the numbers are at its right place and there is this one number that
                // is at the wrong index , which number is this ????  obvious : DUPLICATE number
                // thats why arr[index] which returns the duplicate and arr[index+1] as we know returns missingNum ;
                return new int[] {arr[index] , arr[index+1]};  
            }
        }
        return new int[] { -1 , -1};
    }
    
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
