public class ceilingNumber {
    /*
         When referring to the ceiling of a number in an array, 
         it means finding the smallest value in the array that is greater than or equal to a given number. 
         Here's an example to illustrate the concept:
        
         Let's say we have an array: [2, 5, 8, 10, 13]

        If we want to find the ceiling of the number 7 in this array, the ceiling would be 8 
        because it is the smallest value in the array that is greater than or equal to 7.

        
        "SAME BINARY SEARCH SOLUTION....... we are not finding/searching the element... just returning the next greater element."
            in binaryS. , we return mid if we found the element. here return start.
    */
    public static void main(String[] args) {
        
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println(ceilNum(arr, target));

    }
    static int ceilNum(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) /2;
            if(target == mid){
                return mid;
            }
            if(target > arr[mid]) {
                start = mid + 1;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return arr[start];
    }
}
