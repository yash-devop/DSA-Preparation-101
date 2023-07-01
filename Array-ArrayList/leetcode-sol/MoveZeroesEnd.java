import java.util.Arrays;

public class MoveZeroesEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        // int[] arr = {1,0,1,0,1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(moveZeroEnd(arr)));
    }

    static int[] moveZeroEnd(int[] arr) {
        int lastNonZeroIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                lastNonZeroIndex++;
                int temp = arr[i];
                arr[i] = arr[lastNonZeroIndex];
                arr[lastNonZeroIndex] = temp;
            }
        }

        return arr;
    }

    // static int[] moveZeroEnd(int[] arr){
    // int last = -1;
    // for (int i = 0; i < arr.length; i++) {
    // if(arr[i] == 0){
    // int temp = arr[i];
    // for (int j = i; j < arr.length-1; j++) {
    // arr[j] = arr[j+1];
    // }
    // arr[last] = temp;
    // }
    // }
    // return arr;
    // }
}
