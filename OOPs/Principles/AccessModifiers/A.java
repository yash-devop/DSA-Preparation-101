package AccessModifiers;
public class A{
    private int num;
    String name;
    int[] arr;

    // To actually access the private datamembers,
    // or classes, we use getters and setters.

    //getter
    public int getNum(){
        return num;
    }
    
    //setter
    public void setNum(int number){
        this.num = number;
    }


    public A(int num,String name){
        this.num = num;
        this.name= name;
        this.arr= new int[num];
    }

}