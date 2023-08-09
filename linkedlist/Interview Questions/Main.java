import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // float num = 66.5f;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter float num : ");
        float num =sc.nextFloat();
        System.out.println("enter k base : ");
        int k =sc.nextInt();
        System.out.println(converter(num , k));
    }
    public static int converter(float num , int k){
        int convertedNum = (int)(num);
        int sum=0;
        while(convertedNum > 0){
            int rem = convertedNum % k;
            sum = sum + rem;
            convertedNum = convertedNum / k;
        }
        // while(convertedNum > 0){
        //     int rem = convertedNum % 10;
        //     sum += rem;
        //     convertedNum /=10;
        // }

        return sum;
    }

}
