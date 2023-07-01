import java.util.Arrays;

public class leftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int rotateBy=4;
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        leftRotated(arr, rotateBy, n);
    }
    static void leftRotatedBruteForce(int[] arr, int rotateBy,int n){
        int firstEle = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i]; // shifting elements to left.
        }
        arr[n-1] = firstEle;
        System.out.println(Arrays.toString(arr));
    }
    static void leftRotated(int[] arr , int rotateBy , int n){
        // rotated the whole array.
         reverse(arr,0,arr.length - 1);
        // System.out.println(Arrays.toString(arr));

        reverse(arr,0 , (arr.length - rotateBy) -1 );
        // System.out.println(Arrays.toString(arr));

        reverse(arr, (arr.length - rotateBy)  , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr , int start,int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =  temp;

            start++;
            end--;
        }
    }
}
