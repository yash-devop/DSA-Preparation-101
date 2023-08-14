import java.util.*;
public class RevisionofQuickSort{
    public static void main(String args[]){
        int[] arr = {5,4,3,2,1};
        quicksort(arr, 0, arr.length -1);

        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int low,int high){
        // base condition of recursion
        if(low >= high){
            return;   // end the recursion
        }
        
        int start = low;
        int end = high;
        int mid = start + (end - start ) / 2;
        /*
            here LESSER THAN PIVOT ELEMENTS LIES          here GREATER THAN PIVOT ELEMENTS LIES
            _____________________________________ PIVOT  _______________________________________
         */


        // best case : o(nlogn) => pivot = Middle ELement
        // worst case : o(n^2) => pivot = Last ELement
        int pivot = arr[mid]; 
        
        while(start <= end){
            while(arr[start] < pivot){
                start ++;       // means that it is already at its correctposition.. incr start by 1.
            }
            while(arr[end] > pivot){
                end--; // means that it is already at its correctposition.. decr end by 1.
            }

            //  this below code will execute if they are at wrong position. (Violation)

            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // once the while loop ends , means that our pivot element is now at its correct Position.
        quicksort(arr, low, end);
        quicksort(arr, start,high );
    }
}