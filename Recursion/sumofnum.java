public class sumofnum{
    public static void main(String[] args) {
        System.out.println(summ(5));
    }
    static int summ(int n){
        // base condition
        if(n<=1){
            return n;
        }
        return n + summ(n-1);
    }
}
