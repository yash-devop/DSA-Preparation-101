
public class MissingNumber {
    public static void main(String args[]) {
        int N = 5;
        int arr[] = { 2, 5, 3, 1 };
        // int arr[] = { 1,2,3,4,6};
    
        int ans = missingNumber(arr, N);
        System.out.println("The missing number is: " + ans);
        System.out.println(missingNumberHashing(arr, N));
    }
    public static int missingNumber(int[] arr, int N) {
        // Outer loop that runs from 1 to N:
        for (int i = 1; i <= N; i++) {

            // flag variable to check
            // if an element exists
            int flag = 0;

            // Search the element using linear search:
            for (int j = 0; j < N - 1; j++) {
                if (arr[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break; // forloop will get breaked.
                }
            }

            // check if the element is missing
            // i.e flag == 0:

            if (flag == 0)
                return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
        // Time Complexity :  O( N ^ 2 )
    }


    // Better approach :   HASHING ( hashing and hashmap are different ) 

    static int missingNumberHashing(int arr[] , int N){  // N is the size of the arr with the missing element also... whole elements.
         int[] hash = new int[N + 1];  //if N=5 , it will store N=6

         for (int i = 0; i < N - 1; i++) {
             hash[arr[i]] ++;  // we are accessing each element from the arr and putting the same element with the same INDEX inside the hash and increaement the count. 
         }

         for (int i = 1; i <= N; i++) {
            if(hash[i] == 0){  // means that the element not found in the hash[] arr.
                return i;
            }
         }
         return -1;
    }

}
