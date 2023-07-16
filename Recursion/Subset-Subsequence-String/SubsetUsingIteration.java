import java.util.ArrayList;
import java.util.List;

public class SubsetUsingIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subIteration(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subIteration(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        
        
        // When Outer Size is 2 , 2 new list will be created.
        // When Outer Size is 4 , 4 new list will be created.
        
        // why we are taking the Outer Size ?
        /*  eg: arr = [1,2,3]
             eg: initially =>               [ [] ]
             /      \
             iteration1 =>         [ [] ]    [ [1] ]
             /     \
             iteration2 =>              [ [],[1],[2],[1,2] ]   
                                                 /     \
                 iteration2 =>          [ [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3] ]   
                 /     \
                 iteration2 =>          [ [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3] ]   
                 
                 
                 so , after each loop , the size is exactly the size of the outer loop.
                 */
        for (int num : arr) { // we are targeting each number from the array.
            int n = outer.size();

            for (int i = 0; i < n; i++) { // n many times the loop will be run
                List<Integer> internal = new ArrayList<>(outer.get(i)); //outer.get(i) returns the element at the specified index

                // now we are going to add the elements inside it.
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
    }
}
