import java.util.HashSet;
import java.util.Iterator;

public class Concept{
    public static void main(String[] args) {
        // Creation
        HashSet<Integer> set = new HashSet<Integer>();
        // same as : ArrayList<Integer> list = new ArrayList<>();

        // Insert
        // same as list.add(element) in ArrayList.

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // stores unique elements
        
        //  Search : Contains
        // if(set.contains(1)){
        //     System.out.println("Set Contains 1 ");
        // }
        //  if 6 exists ?
        // if(!set.contains(6)){ 
        //     System.out.println("Doesnt contain");
        // }

        //  Delete - Remove

        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("We Deleted 1");
        // }


        //  Size :
        // System.out.println("Size of Set is :" + set.size());

        //  Print all elements of the HashSet ?

         System.out.println(set);



        // hashSet can't be iterate through Forloops.
        // it contains a special Iterator.

        // Iterator:    import java.util.Iterator;

        Iterator it = set.iterator();
        // 'it' -> initial points to NULL . then starts pointing to the next element.


        // hasNext() and next() function
        /*
         1) hasNext() => returns true or false if it has next value to iterate upon.
         eg: [1,2,3] => initially as i said, points to NULL..

            so returns 'true', then 1 which is 'true' , then 2 which is 'true'
            then 3 whic is 'true' and now after 3 no element is there. so 'false'.


         2) next() => used to iterate like ForLoop. returns next value.
         */

         while(it.hasNext()){ // run till true.
            System.out.println(it.next());
        }
    }
}