package leetcode.cyclic;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(cyclicSort(arr));
        // System.out.println(Arrays.toString(arr));
    }
    // same nothing new cyclicSort.
    static int cyclicSort(int[] arr ){
        int i=0;
        while(i < arr.length){

            if(arr[i] != i + 1){
                int correctIndex = arr[i] - 1;  // range [1 to N] else indexoutofbounds.
                if(arr[i] != arr[correctIndex]){
                    swap(arr, i, correctIndex);
                }
                else{
                    return arr[i]; // duplicate found if arr[i] == arr[correctIndex]
                }
            }
            else{ // means already in sorted position.
                i++;  // arr[i] == i + 1
            }
        }
        return -1;
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
