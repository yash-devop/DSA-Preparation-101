public class countZeroes {
    public static void main(String[] args) {
        System.out.println(zeroCounter(2003)); // 6
    }

    static int count = 0;

    static int zeroCounter(int n) {
        int rem = n % 10;
        if (n == 0) {
            return count;
        }
        if (rem == 0) {
            ++count;
        }
        return zeroCounter(n / 10);
    }
}
