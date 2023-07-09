public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7, 1, 2, 4 };

        System.out.println(rotatedSearch(arr, 2, 0, arr.length - 1));
    }

    /*
     * eg: [3,5,6,7,1,4,5] where both halves are sorted differently. 7,1 is the
     * place where changes happened.
     */
    static int rotatedSearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1; // not found.
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) { // it means that the first half is sorted.
            if (target >= arr[start] && target <= arr[mid]) { // means the first half is sorted and target lies in the
                                                              // firsthalf
                return rotatedSearch(arr, target, start, mid - 1);
            } else {
                return rotatedSearch(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) { // means the second half is sorted and target lies in the
                                                        // secondHalf
            return rotatedSearch(arr, target, mid + 1, end);
        } else { // else search in the leftHand side
            return rotatedSearch(arr, target, start, mid - 1);
        }
    }
}
