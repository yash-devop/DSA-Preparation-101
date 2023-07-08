public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(digitSum(1352));
        System.out.println(product(1352));
    }

    static int digitSum(int n) {
        if (n == 0) {
            return n;
        }
        int rem = n % 10;

        return rem + digitSum(n / 10);
    }

    static int product(int n) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;

        return rem * product(n / 10);
    }
}
