public class floorNumber {
    /*
      Floor of a number means "Greatest element smaller than the target element"
      like : [1,3,4,6,8,10,20] SORTED ARRAY.
        target given : 9
        floor will be : 8
     */
    public static void main(String[] args) {
        
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println(floornum(arr, target));

    }
    static int floornum(int[] arr , int target){
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
        return arr[end];
    }
}
