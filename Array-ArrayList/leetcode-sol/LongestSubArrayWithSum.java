public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int givenSum = 15;
        System.out.println(longestSubArrBrute(arr, givenSum));
    }
    // BruteForce : O(N^2)
    static int longestSubArrBrute(int[] arr ,int givenSum){
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == givenSum){
                    longest = Math.max(longest,j - i + 1);  // j - i + 1  will give length of that particular part
                }
            }
        }
        return longest;
    }
}
