import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] merge(int[] arr){
         if(arr.length == 1){ // if arr contains 1 element , no need to have left and right part Logically.
            return arr; 
         }

         int mid = arr.length / 2;

         int[] left = merge(Arrays.copyOfRange(arr, 0 , mid)); // copyRange function will create a newArray of size 0 till mid
         int[] right = merge(Arrays.copyOfRange(arr, mid , arr.length)); 
    
        return mergeArrays(left,right);
    }
    static int[] mergeArrays(int[] first, int[] second) {
        int[] mixArr = new int[first.length + second.length];
        int i=0; // for arr1 or firstArr
        int j=0; // for arr2 or secondArr
        int k=0; // k is just a point which is starting from 0 i.e: mixarr[k] is same as mixarr[0]

        // anyone of this should terminate : i is for arr1 and j is for arr2,
        // here,if i or j reaches the end of the array1 or arr2, just terminate the loop
        while(i < first.length && j < second.length){ 
            if(first[i] < second[j]){
                mixArr[k] = first[i]; 
                i++; 
            }
            else{
                mixArr[k] = second[j]; 
                j++; 
            }
            k++; // everytime , move ahead in mixArr otherwise it will point to mixArr[0] mixArr[k] or only
        }

        // possibility : any one of the i or j reaches the end of the array FIRST ? right !
        // so we need to add the other remaining elements to the mixArr
        /*
            eg: [ 3 5 9 19 32 ]
                [ 4 6 8 ]

                here , j in arr2 is reaches the end quickly than i of arr1.
                so , in mixArr add the remaining elements of arr1. 
         */
        // so , below is the code.
        // anyone of the below code will execute (think !)

         while(i < first.length){
            mixArr[k] = first[i];
            i++;
            k++;
         }

         while(j < second.length){
            mixArr[k] = second[j];
            j++;
            k++;
         }

         return mixArr;
        
    }
}