public class searchInArrays{
    public static void main(String[] args) {
        /* Linear Search says that "Search the Element till you find that element that you are looking for" 
            eg : [18,12,9,14,77,50] search 14.. so it will start and reach 14 and returns 3 as its index
            it will check each n every element of the array.

            refer the notes...
        */
        
        int[] arr = {18,12,9,14,77,50};
        int ans = linearSearch(arr, 77);
        // int ans = linearSearch(arr, -77);  // try this , returns -1
        System.out.println("item is at index :"+ ans);
        
    }
    
    //Search in the array: return the index if item found
    // otherwise , if item not found return -1.
    static int linearSearch(int[] arr , int target){
        // length of arr = 0;
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int i = 0; i < arr.length; i++) {  
            // check for that element at every index if it is present in the array or not.
            //  i = index
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        //this line will execute if none of the return statements above have executed.
        // hence , no target element found in the array.
        return -1;
    }
}