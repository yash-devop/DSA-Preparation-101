import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        // int[] arr = {1,3,0,5,2,7};
        int[] arr = {1,3,4,5,6};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    // i is used for the elements after j will traverse the array.
    // j is used to set the greatest element to the end of the array.
    // we created the swapped boolean variable coz if the array is sorted , then
    // after that also it was running the loop chcking every element
    // so to eliminate that , we created a boolean flag and set it to false and once
    // element got swapped, set it to true..
    static void Bubble(int[] arr){
        boolean swapped;
        // run the steps n - 1 times 
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // for each step , the greater element will come at the last respective index.
            // j < arr.length- i or  j <= arr.length - i - 1
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item smaller than the previous item
                if(arr[j] < arr[j-1]){  //inshort , arr[j-1] greater. arr[j] smaller.
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if we did not swap for a particular value ,means it is sorted 
            if(swapped == false){
                break;  // break the i loop.
            }
        }
    }
}