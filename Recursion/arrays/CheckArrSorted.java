package arrays;

public class CheckArrSorted {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8};
        System.out.println(checkSorted(arr, 0));
    }
    static boolean checkSorted(int[] arr , int index){
        // base condition
        if(index == arr.length -1){  // means if it reaches the last index means that the array is SORTED commonsense !
            return true;
        }
        /* its like :  arr[i] < arr[i+1] eg: 1 3 5 => so 1 < 3 YES TRUE. */
        return arr[index] < arr[index+1] && checkSorted(arr, ++index);
    }
}
