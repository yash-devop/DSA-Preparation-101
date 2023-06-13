public class searchTargetInMoutain {
    //https://leetcode.com/problems/find-in-mountain-array/description/
    public static void main(String[] args) {
     //              0 1 2 3 4 5 6
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int peak = PeakFinder(arr);
        int firstTry = orderAgnobinarySearch(arr, target,0,peak);
        int secondTry = orderAgnobinarySearch(arr, target, peak+1, arr.length - 1);
        // first side try before peak
        if(firstTry!=-1){
            System.out.println(firstTry);
        }
        else{
            // 2nd side try after peak
            System.out.println(secondTry);
        }
    }
    static int PeakFinder(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while(start!=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){  // decreasing order and checking to the left side for more posiibilities.
                end = mid; //this may be the ans or more lies to the LEFT .. thatsy end = mid and not mid - 1;
            }
            else{ //arr[mid] < arr[mid + 1]; ascending order and checking to the right side fr more posibilities
                start = mid + 1; 
            }
        }
        return start;

    }
    static int orderAgnobinarySearch(int[] arr , int target , int start , int end){
        // int start = 0;
        // int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];  // returns true if condition correct, else false.

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

            if(arr[mid] == target){
                return mid; //answer found.
            }

            if(isAsc){ // if array is ascending, execute the below.
                if(target < arr[mid]){  // means element Lies in the LEFT Hand Side
                      end = mid - 1;
                }
                else{ // means element lies in the RIGHT HAND SIDE.
                    start = mid + 1;
                }
            }

            else{
                if(target >  arr[mid]){  // means element Lies in the LEFT Hand Side
                      end = mid - 1;
                }
                else { // means element lies in the RIGHT HAND SIDE.
                    start = mid + 1;
                }
            }
        }
        return -1; //no element found in the array
    }
}
