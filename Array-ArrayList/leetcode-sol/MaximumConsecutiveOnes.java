public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        // int[] arr = {1,1,0,1,1,1};
        int[] arr = {1,0,1};
        // int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    static int findMaxConsecutiveOnes(int nums[]) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
}
