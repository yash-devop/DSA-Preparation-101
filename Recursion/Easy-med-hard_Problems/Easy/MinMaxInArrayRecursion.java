public class MinMaxInArrayRecursion {
    public static void main(String[] args) {
        // int[] arr = { 1, 4,123, 154, 321, 1324, 32143 };
        int[] arr = { 1, 4,123, 154,-1 , 2 ,-2 ,321, 1324, 32143 };
        int[] result = minmax(arr, 0, arr[0], arr[0]);
        System.out.println("Min value: " + result[0]);
        System.out.println("Max value: " + result[1]);
    }

    static int[] minmax(int[] arr, int index, int min, int max) {
        if (index == arr.length) {
            int[] result = { min, max };
            return result;
        }
        if (arr[index] > max) {
            max = arr[index];
        }
        if (arr[index] < min) {
            min = arr[index];
        }
        return minmax(arr, ++index, min, max);

    }
    
}
