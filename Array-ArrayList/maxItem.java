public class maxItem {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,66};
        System.out.println("The maximum element in the array :" + maxItem(arr));
        System.out.println("The maximum element in the range :" + maxItemRange(arr,0,3));

    }
    static int maxItem(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }
    //  0 1 2  3  4
    // [1,2,34,3,66]  => 1 and 4 
    static int maxItemRange(int[] arr , int index1 , int index2){
        // work on some edge cases like arry if empty ...
        if(arr == null){
            return -1;
        }
        if(index2 > index1 ){
            return -1;
        }
        int max = arr[index1];
        for (int i = index1; i <= index2; i++) {
            if( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
