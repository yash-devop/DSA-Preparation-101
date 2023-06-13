public class MoutainPeakIndex {
    // https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // leetcode : 852

    /*
        here we are applying binarysearch but in binary search we have given the TARGET element.
        in this ques, we dont have target element.
        so see the code below to develop intuition.
     */
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,8,7,6};
        System.out.println(PeakFinder(arr));
    }
    static int PeakFinder(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;
        while(start!=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){  // decreasing order and checking to the left side for more posiibilities.
                end = mid; //this may be the ans or more lies to the LEFT .. thatsy end = mid and not mid - 1;
            }
            else{ //arr[mid] < arr[mid + 1]; ascending order and checking to the right side fr more posibilities
                start = mid + 1; 
            }
        }
        return start;
        // if they ask find the Peak Element, return arr[start]
        // this was leetcode 162. MEDIUM question
    }

}
