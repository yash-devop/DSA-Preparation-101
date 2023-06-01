import java.util.Arrays;
import java.util.Scanner;

public class concatArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array Size :");
        int firstArraySize = sc.nextInt();
        int[] arr = new int[firstArraySize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(getConcatenation(arr)));

        sc.close();
        
    }
    
    // main logic starts here.
    static int[] getConcatenation(int[] nums){

        int[] ans = new int[(nums.length*2)];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            // first half of the output array.
            ans[i]=nums[i];  
            //second half of the output array.
            ans[i+n]=nums[i]; /* here, we are adding the length of the First Array coz its repeating like:

            index    0 1 2            0 1 2 3 4 5 
                    [1,2,3] then => [ _ _ _ _ _ _ ] (array x 2)
            so,     [1,2,3] then => [ 1,2,3,1,2,3 ] (array x 2)


            */
        }
        return ans;
    }

}
