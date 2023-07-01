import java.util.Arrays;

public class FirstLastElement {
    public static void main(String[] args) {
        // Find First and Last Position of Element in Sorted Array
        /*
         Input: nums = [5,7,7,8,8,10], target = 8
         Output: [3,4]

         Input: nums = [5,7,7,8,8,10], target = 6
         Output: [-1,-1]
         */
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = {-1,-1};

        int first = firstlastElement(arr, target, true);
        int last = firstlastElement(arr, target, false);

        ans[0] = first;
        ans[1] = last;

        System.out.println(Arrays.toString(ans));


    }
    static int firstlastElement(int[] arr , int target , boolean findTargetIndex){
        // Applying Binary Search coz its SORTED ARRAY.
        int start = 0;
        int end = arr.length - 1;
        int ans = -1; // let it be -1 , it can be anything.
        while ( start <= end){
             int mid = start + (end-start)/2;
             if(target < arr[mid]){ 
                  end = mid - 1;
             }
             else if(target > arr[mid]){ 
                start = mid + 1;
             }
             else{  // target == arr[mid];
                ans = mid;
                if(findTargetIndex) { //if true.
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
             }
        }
        return ans;
    }
}
