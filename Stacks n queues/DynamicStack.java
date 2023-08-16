public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); // it will call the CustomStack() Construtor
    }

    public DynamicStack(int size){
        super(size); 
    }

    // what is this override ? 
    /*
      basically i want to use all the properties that i have defined in the CustomStack.java and i m extending it 
      so now i can use the propoerties ..  but i want to use my method ( eg: CustomStack have same push method and dynamicStack also have 
      the same method called push but different functionality)
      in this case , we use override to override my function instead of what i m extending.
     */
    @Override
    public boolean push(int item){
        // this takes care of it being full 
        if(this.isFull()){
            // double the array size :

            int[] temp = new int[data.length * 2];
            
            // copy all the previous items in the new array.

            for(int i=0; i < data.length -1 ; i ++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // at this line , we know array is not full .
        // insert the item normally.
        return super.push(item);  

    }

}
