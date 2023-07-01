package leetcode.cyclic;
// https://leetcode.com/problems/missing-number/description/


public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};  //0,1,3
        System.out.println(missing(arr));
    }
    static int missing(int[] arr){
        CyclicSort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                return i;
            }
        }

        return arr.length;

    }
    static void CyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){  // arr[i] < N because that element cant be put at its index coz indexoutofbound.
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
