public class Binarysearch {
    // Using Recursion
    // https://www.youtube.com/watch?v=M2uO2nMT0Bk&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=1
    public static void main(String[] args){
        int[] arr = {3,5,8,12,15,18,23,25,30};
        int target = 3;
        System.out.println(BS(arr, target, 0, arr.length - 1));
    }
    static int BS(int[] arr , int target , int start , int end){
         if(start > end){ // while(start <=end)
            return -1;   
         }
         int mid = start + (end-start)/2;
         if(target < arr[mid]){
            return BS(arr, target, start, mid - 1);
         }
         if(target == arr[mid]){   // we found the ans.
            return mid;
         }
         return BS(arr, target, mid + 1, end);  // if target > arr[mid]
    }

}