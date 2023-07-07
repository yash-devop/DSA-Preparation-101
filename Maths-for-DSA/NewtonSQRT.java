public class NewtonSQRT{
    public static void main(String[] args) {
        System.out.println(newtonSqrt(40));
    }
    static double newtonSqrt(double n){
        double x = n; // assumed 'x' will be initially the n
        double root;
        
        while(true){
            root = 0.5 * (x + (n/x));  // actual formula: root =  ( x + (n/x) ) / 2 
            if(Math.abs(root - x) < 0.5){ //abs turns -ve to +ve(always)   // 0.5 is the error.
                break;  // found the ans.
            }
            else{
                x = root;  // now the new assumed will be the new root
            }
        }
        return root;
    }
}