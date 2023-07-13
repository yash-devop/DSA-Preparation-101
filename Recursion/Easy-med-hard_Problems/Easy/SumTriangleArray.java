import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // int[] list = new int[arr.length];
        sumTriangle(arr,0,0);
    }
    static void sumTriangle(int[] arr , int index , int k){
        if(arr.length < 1){
            return;
        }
        int[] list = new int[arr.length -1];

        while(index < arr.length - 1 ){
            list[k] = arr[index] + arr[index+1];
            index++;
            k++;
        }
        sumTriangle(list,0, 0);
        System.out.println(Arrays.toString(arr));
        
    }
}
