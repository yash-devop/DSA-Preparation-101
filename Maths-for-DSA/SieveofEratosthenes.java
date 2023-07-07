public class SieveofEratosthenes {
    //204. Count Primes  LEETCODE

    // Given an integer n, return the number of prime numbers that are strictly less than or equal to n.
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1]; // nth num should be included. index starts from 0 and if we give only n
                                               // then 0...39
        // SievePrime(primes, n);
        System.out.println(SievePrime(primes, n));
    }

    // false in the array means "Number is prime"
    static int SievePrime(boolean[] primes, int n) {
        int count = 0;
        if (n <= 1) {
            return 0;
        }
        for (int i = 2; i * i <= n; i++) {
            // initially we know that all the numbers in the boolean array is going to be
            // FALSE.
            if (!primes[i]) { // if that element is FALSE
                // why j+=i => because we are checking the multiples..
                /*
                 * eg: 2 3 4 5 6 7 8 9 .... 40 so if we do j++ then after checkng 2 , it will go to 3
                 * but we want it to go to 4 then 6 then 8 and ... (multiples ) which is j = j + i
                 * which is 2 = 2 + 2 so j = 4
                 * thatsy : j+=i or j = j + i
                 */
                for (int j = 2 * i; j <= n; j += i) { // just make TRUE/cross to all the multiples of that INDEX(i)
                    primes[j] = true; // turn that element as CROSSED / TRUE.
                }
            }
        }
        // just print accordingly.
        for (int i = 2; i < n; i++) {
            if (!primes[i]) { // if that element is FALSE
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println(" ");
        return count;
    }
}
