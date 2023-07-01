public class findElemInfiniteArray{
    public static void main(String[] args) {
        // Find position of an element in a sorted array of infinite  numbers.

        // we can't define infinite array .. we have to imagine that the array is infinite..
        // means we can use the function : array.length   coz its infinite..
        // now solve the questn.

        /* Approach : Now , how to apply BinarySearch ? We have to reverse think like how binarysearch work
         like there is N size array so at every step we divide it into 2 part and check whether the target lies
         in that part or not. N then N/2 then N/4 then N/8 .....till.... 1   (1 is that remaining target element)

        //  In question , we know that we have to apply BinarySearch(sorted araray thats y.) and find the 
        element's position... but because of infinte arr and so we cant use the arr.length to find the
        start and end index...

        we have to reverse the logic that   from 1 to ..... to N/8...N/4...N/2...N
        so first we start from smaller chunk and if Target is not in that Chunk ( range ) , we will
        increase that range/CHUNK , and by this we can find the start and end index in an infinite arr;
        */

        int[] arr = {3,5,6,7,8,10,11,12,15,21,23,30};  //we defined an long array and imgine its infinite.
        int target = 10;

        System.out.println(ans(arr, target));
        
    }
    static int ans(int[] arr , int target){

        // find the range.
        // first start with a box of size 2.
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range.

        while(target > arr[end]){
            int temp = end + 1;
            // double the box value.
            // end = previousEnd + sizeofbox * 2;
            // sizeofbox = (end - start + 1)  => give the elements Length or
            // end - (start - 1) 
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
        
    }
    static int binarySearch(int[] arr , int target , int start , int end){

        // for searching the element
        while ( start <= end){
            int mid = start + (end-start)/2;

             if(target < arr[mid]){  // means element Lies in the LEFT Hand Side
                  end = mid - 1;
             }
             else if(target > arr[mid]){ // means element lies in the RIGHT HAND SIDE.
                start = mid + 1;
             }
             else{ // target == middle element.
                return mid; 
             }
        }
        return -1;
    }
}