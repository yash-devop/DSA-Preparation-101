public class fibonacci{
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    static int fibo(int n){
        //base condition
        if(n < 2){
            return n;   // fibo(1) = 1  &  fibo(0) = 0;
        }
        return fibo(n-1) + fibo(n-2);
    }
}