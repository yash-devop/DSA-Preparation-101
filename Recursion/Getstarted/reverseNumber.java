public class reverseNumber {
    public static void main(String[] args) {
        System.out.println(revNum(0, 1352)); // 2531
        System.out.println(revNumberWay2(13522)); // 2531
    }

    //better
    static int revNum(int reverse, int n) {
        if (n < 1) {
            return reverse;
        }
        int rem = n % 10;

        return revNum(reverse * 10 + rem, n / 10);
    }
    // way 2
    static int reverse = 0;
    static int revNumberWay2(int n) {
        int rem = n % 10;
        reverse = reverse * 10 + rem;
        int quotient = n / 10;
        if (n < 2) {
            return reverse;
        }
        return revNumberWay2(quotient);
    }
}