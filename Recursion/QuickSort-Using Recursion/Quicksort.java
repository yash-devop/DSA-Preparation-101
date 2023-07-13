import java.util.Arrays;

public class Quicksort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sortQuick(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
    /*
     low and high are just explaining which part of the array you are working on.
     (go and check mergesort using recursion. there we were creating array.copyrange
        but here we are doing inplace.
     )
     start and end are for : Swapping comparisons.
     */
    static void sortQuick(int[] arr, int low ,int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;

        int mid = start + (end - start) / 2;

        int pivot = arr[mid];  // explained. why mid.

        // time complexity : nested whileloops : O(N^2)
        while(start <=end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            // this below line executes whenever the above 2 condition not met.
            if(start <= end){ // might be possible that start >= end while doing start++ and end--;
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // recursion call
        /*
          now my pivot is at the correct index , please sort two halves
         */
        sortQuick(arr, low, end);
        sortQuick(arr, start, high);

    }
}