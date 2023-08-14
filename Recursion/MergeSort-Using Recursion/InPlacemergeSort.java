import java.util.Arrays;

public class InPlacemergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        // int[] arr = {5,8,2,4,3,10};
        mergeInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeInPlace(int[] arr,int start, int end) {
        if (end - start == 1) { // if arr contains 1 element , no need to have left and right part Logically.
            return;
        }

        int mid = start + (end-start)/ 2;

        mergeInPlace(arr, start, mid); 
                                                            
        mergeInPlace(arr, mid, end);

        mergeArrays(arr, start , mid , end);
    }

    static void mergeArrays(int[] arr , int start , int mid , int end) {
        int[] mixArr = new int[end - start];
        int i = start; // for arr1 or firstArr
        int j = mid; // for arr2 or secondArr
        int k = 0; // k is just a point which is starting from 0 i.e: mixarr[k] is same as
                   // mixarr[0]

        // anyone of this should terminate : i is for arr1 and j is for arr2,
        // here,if i or j reaches the end of the array1 or arr2, just terminate the loop
        while (i < mid && j < end) {  // i will go till mid and j will go till end coz its starting from mid.
            if (arr[i] < arr[j]) {
                mixArr[k] = arr[i];
                i++;
            } else {
                mixArr[k] = arr[j];
                j++;
            }
            k++; // everytime , move ahead in mixArr otherwise it will point to mixArr[0]
                 // mixArr[k] or only
        }

        // possibility : any one of the i or j reaches the end of the array FIRST ?
        // right !
        // so we need to add the other remaining elements to the mixArr
        /*
         * eg: [ 3 5 9 19 32 ]
         * [ 4 6 8 ]
         * 
         * here , j in arr2 is reaches the end quickly than i of arr1.
         * so , in mixArr add the remaining elements of arr1.
         */
        // so , below is the code.
        // anyone of the below code will execute (think !)

        while (i < mid) {
            mixArr[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            mixArr[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0; l < mixArr.length ; l++){
            arr[start + l] = mixArr[l];
        }

    }
}
