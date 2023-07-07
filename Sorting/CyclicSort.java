import java.util.Arrays;

// handles duplicates and unique elements also !! where i++ is the statement which handles this duplication.
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {  // when it gets equal to the length , means it already sorted.. exit loop.
            int correct = arr[i] - 1; // range [ 1  to N ]
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);  // not equal , swap the elements to their correct position.
            } else {
                i++;  // means it equal
            }
        }
    }

    //swap function.
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
