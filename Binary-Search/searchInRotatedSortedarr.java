public class searchInRotatedSortedarr {
    // leetcode 33. Search in Rotated Sorted Array.
    /*
        Input: nums = [4,5,6,7,0,1,2], target = 0
        Output: 4

        Input: nums = [4,5,6,7,0,1,2], target = 3
        Output: -1

     */

    //  ROTATED BINARY SEARCH
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findPivot(arr));
    }   
    public static int search(int[] arr , int target){
        int pivot = findPivot(arr);

        // if you dont find the pivot , it means the array is not rotated.
        if(pivot == -1){
            // just do normal binary Search bcoz arr is not rotated.
            return binarySearch(arr, target,0,arr.length -1);
        }
        // if pivot is found , you have found 2 asc sorted arrays.
        if(arr[pivot] == target){
            return pivot;
        }
    }

    static int binarySearch(int[] arr , int target, int start , int end){
        while ( start <= end){
            // find the middle element.
            // int mid = (start + end) / 2; Note: there might be a possiblity that the value of start+end exceeds the range of Integers in JAVA.
            int mid = start + (end-start)/2;
            /*
                explaination: 
                start + (end - start) / 2
                =>
                [  2start + end - start  ]  / 2
                => ( start + end ) /2      <-- which is the same as we do directly : mid = (start + end ) /2
             */


             if(target < arr[mid]){  // means element Lies in the LEFT Hand Side
                  end = mid - 1;
             }
             else if(target > arr[mid]){ // means element lies in the RIGHT HAND SIDE.
                start = mid + 1;
             }
             else{ // target == middle element.
                return mid ; 
             }
        }
        return -1;
    }
    // this function returns the index.
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;

            // 4 cases
            if(mid < end && arr[mid] > arr[mid+1]){ //why mid < end because if the mid is at the last index of arr. outofbound err.
                return mid; // found the ans
            }

            if(mid > start && arr[mid] < arr[mid-1]){  //same reason.
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;

            }
            else{ //no pivot found , search in the 2nd part of the array ...
                start = mid + 1; 
            }
        }
        return -1;
    }
}
