import java.util.Arrays;
import java.util.Scanner;

// swapping elements in array.

public class swapArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            [1 , 2 , 4 , 3]
            result = [ 1 , 2 , 3 , 4]
         */
            int[] arr = {1,2,4,3};

            System.out.println("Before swapping:" + Arrays.toString(arr));
            swap(arr ,2,3);

            System.out.println(Arrays.toString(arr));

            sc.close(); // jdk 20 requires to close the scanner.
        }

        /* here , return type is void coz we just want to swap the array element. not to return anything
            from the swap() function that we created.
        */


        static void swap(int[] arr , int index1 , int index2){
            int temp = arr[index1]; /* here, creating a temp variable to store the first indexed Element. */
            arr[index1] = arr[index2]; /*now , the original first indexed element is empty. in place, put index2 element. */
            arr[index2] = temp; /* now original index2 place is empty. in place, put the temp value in it.*/

        }
}
