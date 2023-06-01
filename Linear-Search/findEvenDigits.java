public class findEvenDigits {
    public static void main(String[] args) {
        int[] arr = {18,124,9,1764,98,1};
        System.out.println(findEvenDigits(arr));
       
    }
    static int findEvenDigits(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num) { //18
        int count = 0;
        while(num > 0){
            num = num / 10;
            // num = num % 10; // 8
            count++;
        }
        if(count % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
