package AccessModifiers;

public class ObjectClassDemo {

    int num;

    public ObjectClassDemo(int num){
        this.num = num;
    }

    
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    
    

}
