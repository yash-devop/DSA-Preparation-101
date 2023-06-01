public class searchInRange {
    public static void main(String[] args) {
        // LinearSearching within a range.
        // Search for element 3 in the range of index[1 , 4]
        int[] arr = {18,12,9,14,77,50};
        int ans = linearSearch(arr, 9,1,5);
        // int ans = linearSearch(arr, -77);  // try this , returns -1
        System.out.println("item within the given range is :" + ans);
    }
        
    
    
    //Search in the array: return the index if item found
    // otherwise , if item not found return -1.
    static int linearSearch(int[] arr , int target, int start , int end){
        // length of arr = 0;
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int i = start; i <= end; i++) {  
            // check for that element at every index if it is present in the array or not.
            //  i = index
            int element = arr[start];
            if(element == target){
                return start;
            }
            start++; // increment the start index by 1.
        }
        //this line will execute if none of the return statements above have executed.
        // hence , no target element found in the array.
        return -1;
    }
}
