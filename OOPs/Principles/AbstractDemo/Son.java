package AbstractDemo;

/*
 public class Son extends Parent
 bcoz in parent we have career which has no body.
 so, Son will extend the parent class and then add the body
 to the abstract class.
 
 Now,   public class Son extends Parent{

 }
 will give error coz its saying that hey ur parent is abstract
 and u are trying to override it ,

 so now , we have to externally call the career function
 in this Son class.
 thats why @override
 and calling exactly the same function
 provided by the parent.
 
 */


public class Son extends Parent , Parent2{

    public Son(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("Iam going to be a coder" );
    };
    
    @Override
    void partner(){
        System.out.println("i love ryan gosling");
    };


}
