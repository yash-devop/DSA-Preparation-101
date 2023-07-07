public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD(3, 6));
    }
    static int findGCD(int num1,int num2){
        if(num1 == 0){  // what is gdc(0,300) ? ans : 300
            return num2;
        }
        return findGCD(num2 % num1 , num1);
    }
}
