
import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // hard-coded normal way to create the Array.
        int[] arr = {1,2,3,4,5};

        // other way
        int[] arr2 = new int[5];
        
        // instead of doing manually ,  arr2[0] = 1;   use Foreach or forloop

        // Note: foreach loop is only applicable on ARRAYS !!


        // loop1:
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr2));


        
        // loop2 :
        // foreach loop : 
        // foreach loop is used for direct accessing the element instead of doing arr[i].

        /*
            syntax : 
            for(<DatatypeOfArr> element : theArrayName){

            }

        */

        // like this :
        // for(int ele : arr2){
        //     System.out.println(ele);
        // }
        sc.close(); // jdk 20 requires to close the scanner.
    }
}
