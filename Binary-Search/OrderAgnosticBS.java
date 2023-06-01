public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,8,15,55,523,1453,5001};
        // int[] arr = {11,8,5,5,5,3,1};
        // int[] arr = {2,4,6,9,11,12,14,20,36,48};
        System.out.println(orderAgnobinarySearch(arr, 5001));
    }
    // return the index
    // return -1 if it does not exist
    static int orderAgnobinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
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
