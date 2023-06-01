import java.util.Arrays;

public class searchIn2dArray{
    public static void main(String[] args) {
        int[][] arr =
        {
            {1  ,  2 ,  3}, // 0th , inside this 0th 1st 2nd indexes
            { 4 ,  5 , 10 ,123,42}, // 1st , inside this 0th 1st 2nd indexes
            {-1 ,  6 }, // 2nd , inside this 0th 1st 2nd indexes
            {11 } // 2nd , inside this 0th 1st 2nd indexes
        };
        // {
        //     {1  ,  2 ,  3}, // 0th , inside this 0th 1st 2nd indexes
        //     { 4 ,  5 , 10}, // 1st , inside this 0th 1st 2nd indexes
        //     {-1 ,  6 ,  8}, // 2nd , inside this 0th 1st 2nd indexes
        // };
        int target = 123;
        // int target = 5111;
        System.out.println(Arrays.toString(array2dsearch(arr ,target )));
        System.out.println("Maximum element : " + max2d(arr));
    }
    // search in 2D array. 2 forloops will be used.
    static int[] array2dsearch(int[][] arr , int target ){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if(element == target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1,-1}; // not found.
    }
    
    //  note : to find the maximum element , just return the element instead of returning the index.
    static int max2d(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] element : arr){
             for(int item : element){
                if(item > max){
                    max = item;
                }
             }  
        }
        return max;
    }
}