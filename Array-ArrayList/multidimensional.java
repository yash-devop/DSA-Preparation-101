import java.util.Arrays;
import java.util.Scanner;

public class multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
            this are the 2D-arrays:
            [1 , 2 , 3]
            [4 , 5 , 6]
            [7 , 8 , 9]
        */
         int[][] arr = new int[3][3];
         for (int row = 0; row < arr.length; row++) {  // 0 1 2
             for (int col = 0; col < arr[row].length;col++ ) {
                 arr[row][col] = sc.nextInt();
             }
         }
        //  Outut way 1
         for (int row = 0; row < arr.length; row++) {
            for(int col = 0;col < arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
         }

        //  2nd way : toString() method to convert array into String
        // and to add [] to start and end.q

         System.out.println("2nd Way to output");

         for (int row = 0; row < arr.length; row++) {
             System.out.println(Arrays.toString(arr[row]));
            
         }

        //  enhanced forLoop : foreach
        // only applicable on arrays.

         for(int[] a : arr){
            System.out.println(Arrays.toString(a));
         }


         sc.close(); // jdk 20 says to close the Scanner input.

    }
}
