package packageFolder;

public class prog2 {
    public static void main(String[] args) {
        System.out.println("DIRECT PSVM");
    }
    public void sayHi(){
        System.out.println("prog1 : Say hi !!");
    }
    public void calc(int a , int b){
        System.out.println("Your answer : "+ (a+b));
    }
    public int calcRet(int a , int b){
        return  a + b;
    }
}
