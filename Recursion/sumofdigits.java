public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(digitSum(1352));
    }
    static int digitSum(int n){
        if(n==0){
            return n;
        }
        int rem = n % 10;

        return rem + digitSum(n / 10);
    }
}
