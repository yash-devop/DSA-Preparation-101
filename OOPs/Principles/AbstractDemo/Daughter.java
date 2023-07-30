package AbstractDemo;

public class Daughter extends Parent{
    public Daughter(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("Iam going to be a doctor" );
    };
    
    @Override
    void partner(){
        System.out.println("i love ryan gosling");
    };
}
