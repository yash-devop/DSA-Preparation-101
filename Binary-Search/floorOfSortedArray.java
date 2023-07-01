public class floorOfSortedArray {
    public static void main(String[] args) {
        // Floor of a number means bigger element smaller than or EQUAL to the TARGET.
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(ceilingNumber(arr, target));
    }
    static int ceilingNumber(int[] arr , int target){
        if(target < arr.length - 1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // target == mid
            if(target == arr[mid]){
                return mid;
            }
            // target < mid
            if(target < arr[mid]){
                end = mid - 1;
            }
            // target > mid
            if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return arr[end];  // returning the element instead of index
        // in ceiling question , return arr[start] or start.
    }
}
