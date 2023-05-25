import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        // reverse the array !
        int[] arr = { 56,1,5,2,6,6};
        reverse(arr); // function call
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0; //first index will be your start
        int end = arr.length - 1; //if length of the array is 5, last index is 4.

        while (start < end){ /* if end becomes > then start, then stop swapping. */
            // swap function call.
            swap(arr,start,end);

            // after swapping , we should increment the start index and decrement from right to left in end.
            start++; 
            end--;
        }
    }
    /* swapping function. */
    static void swap(int[] arr , int start , int end){
        int temp = arr[start]; /* here, creating a temp variable to store the first indexed Element. */
        arr[start] = arr[end]; /*now , the original first indexed element is empty. in place, put index2 element. */
        arr[end] = temp; /* now original index2 place is empty. in place, put the temp value in it.*/
    }
}
