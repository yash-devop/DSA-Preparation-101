import java.util.Arrays;

public class InsertionSort {
    public static void main(String args[]) {
        // int[] arr = {1,3,0,5,2,7};
        // int[] arr = { 1, 0,8,4,4,4,5};
        int[] arr = {5,4,3,2,1};
        insertion(arr); 
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) { // i<arr.length-1
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j, j - 1);  // swap the values at the index.
                } else {
                    break; // means already sorted part.
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
