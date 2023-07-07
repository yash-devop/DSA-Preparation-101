public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int precision = 3;

        System.out.println("root is " + root(n,precision));
    }
    static double root(int n , int precision){
        int start = 0;
        int end = n - 1;
        double root = 0.0;
        // binarySearch coz sorted numbers.
        // this is used to find the perfect squareroot.
        while(start <= end){ 
            int mid = start + (end - start)/2;
            if(mid * mid == n){
                root = mid;
                return root;
            }
            else if(mid * mid > n){  // means it lies to the left hand side
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        // precision function.
        double incr = 0.1;
        for (int i = 0; i < precision; i++) {  // for finding the precision eg: 6.34  so 0.34 is the precision
            /*
             eg: n=40 and precision =3 so 
             after the binarysearch we got , 6 as perfect square.
             now , 6*6 <= 40 YES so,6+0.1 = 6.1
             now , 6.1*6.1 <= 40 YES so,6.1+0.1 = 6.2
             now , 6.2*6.2 <= 40 YES so,6.2+0.1 = 6.3
             now , 6.3*6.3 <= 40 YES so,6.3+0.1 = 6.4
             is 6.4 * 6.4 <=40 ? NO , go back to 6.3
             THATS Y :  root = root - incr;  ie: 6.4-0.1 => 6.3
                        incr /=10;

                        now y incr /=10 ? bcoz now we got the 6.3 now we want the 6.3_  this number.
                        thats y incr = 0.1/10 => 0.01

                        again same : 6.3*6.3 <=40 YES : 6.3+0.01 = 6.31
                        like this.
            */
            while(root * root <= n){ 
                root = root + incr;
            }
            root = root - incr;  // go back
            incr /=10;
        }
        return root;
    }
}
