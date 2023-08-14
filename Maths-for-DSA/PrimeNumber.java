public class PrimeNumber{
    public static void main(String[] args){
        int num = 13;
        // for (int i = 2; i <= num; i++) {   // visual representation only, nothing else.
        //     System.out.println(i + "=" + isPrime3(i));
        // }
        System.out.println(isPrime3(num));
    }
    // Method1. 
    static String isPrime1(int num){
        if(num <=1){
            return "Not a prime";
        }
        for(int i=2;i<num;i++){
            if(num % i == 0){
                return "No a prime";
            }
        }
        return "Yes a prime.";
    }
    // better than method1 as we are using sqrt().
    static String isPrime2(int num){
        if(num <=1){
            return "Not a prime";
        }
        System.out.println(Math.sqrt(num));
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return "No a prime";
            }
        }
        return "Yes a prime.";
    }

    static boolean isPrime3(int num){
        int i = 2;
        if(num <=1){
            return false;
        }
        while(i*i <= num){  // i = sqrt of num   => so squaring both the sides sqrt will get cut.= > i * i = num (basic maths.)
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}