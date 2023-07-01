public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(result(arr));
    }

    static boolean result(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(ans > arr[i]){
                return true;
            }
            // break;
        }
        return false;
    }
}
