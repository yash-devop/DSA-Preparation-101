public class BinarySearch{
    // Ascending order array.
    public static void main(String[] args) {
        // REMEMBER: Array must be SORTED !! 
        int[] arr = {2,4,6,9,11};
        // int[] arr = {2,4,6,9,11,12,14,20,36,48};

        System.out.println(binarySearch(arr, 9));
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;

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
}