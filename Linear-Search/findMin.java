public class findMin {
    public static void main(String args[]){
        // find the minimum element from the array without sorting. and return that element.
        int[] arr = {18,12,9,14,77,50};
        System.out.println(minElem(arr));
    }
    static int minElem(int[] arr){
        int min = arr[0];
        // assume , first element is the maximum.
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
