public class palindrome {
    public static void main(String[] args) {
        // System.out.println(palidromeNum(13381));
        System.out.println(palidromeNum(1331));
    }
    static int revNum(int reverse, int n) {
        if (n < 1) {
            return reverse;
        }
        int rem = n % 10;

        return revNum(reverse * 10 + rem, n / 10);
    }
    static boolean palidromeNum(int n){
        return n==revNum(0, n);
    }
}
