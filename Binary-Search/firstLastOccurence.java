import java.util.Arrays;

public class firstLastOccurence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = {-1,-1};
        
        ans[0] = BinSearch(arr, target , true);  // left
        ans[1] = BinSearch(arr, target , false); //right

        System.out.println(Arrays.toString(ans));
    }
    static int BinSearch(int[] arr , int target, boolean flag){
        int start = 0;
        int end = arr.length - 1;
        int value = -1;
        while ( start <= end){
             int mid = start + (end-start)/2;
             if(target < arr[mid]){  // means element Lies in the LEFT Hand Side
                  end = mid - 1;
             }
             else if(target > arr[mid]){ // means element lies in the RIGHT HAND SIDE.
                start = mid + 1;
             }
             else{ // target == middle element.
                value = mid;
                // we got the mid as our target... but there can be more same elements BEFORE and AFTER mid.. so : 
                if(flag){ //if true means go and check the left side to get the first occurence.
                    end = mid - 1;
                }
                else{ // checking the last occurence to the RIGHT.
                    start = mid + 1;
                }
             }
        }
        return value;
    }
}
