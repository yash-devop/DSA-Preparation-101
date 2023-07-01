public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        // int[] arr = {1,1,2,2,2,3,3};
        // int[] arr = {1,1,2};
        // System.out.println(removeDup(arr));
        int a = removeDup(arr);
        for (int i = 0; i < a ; i++) {
            System.out.println(arr[i]);
        }
    }
    static int removeDup(int[] arr ){
        int i=0;
        for(int j=1;j < arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j]; //the last duplicate value with next new number. example:  0,0,1,1,1  the last 0 is now replaced with the 1st ONE.
            }
        }
        return i+1;
    }
}
