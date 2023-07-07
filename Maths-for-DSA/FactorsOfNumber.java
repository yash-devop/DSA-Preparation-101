public class FactorsOfNumber {
    public static void main(String[] args) {
        // a number that divides another number is called the Factor of the number.
        /*
          eg: n = 20
          what are all the numbers that divide 20 ?   1 2 4 5 10 20
         */
        int n = 20;
        findFactor(n);

    }
    // brute force.
    // time : 0(n) space o(1)
    static void findFactor(int n ){
        for (int i = 1; i <=n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    /*
    rearrangement issue in bruteforce method :
    n=20  and above forloop i=1 till 20.0
    20 % 1 => 20 * 1 = 20 ? yes
    20 % 2 => 10 * 2 = 20 ? yes
    20 % 4 => 5  * 4 = 20 ? yes
    20 % 5 => 4  * 5 = 20 ? yes, but  did you see the rearrangement 5*4 and 4*5
    
    means if 5 * 4 = 20 means 5 also a factor and 4 also a factor? RIGHT
    so why are you checking it again and again 
    
    SO ONLY CHECK TILL THE sqrt of n !
    */
    static void findFactor2(int n ){
        for (int i = 1; i*i <=n; i++) {  // i = sqrt(n) => i*i = n ? right basic math.
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
