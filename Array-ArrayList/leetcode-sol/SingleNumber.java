import java.util.Arrays;

public class SingleNumber {
    // https://leetcode.com/problems/single-number/
    // https://practice.geeksforgeeks.org/problems/element-appearing-once2552/0?company[]=Qualcomm&company[]=Qualcomm&difficulty[]=1&page=1&query=company[]Qualcommdifficulty[]1page1company[]Qualcomm&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=element-appearing-once
    // https://www.youtube.com/watch?v=4sQL7R5ySUU&pp=ygUwZmluZCB0aGUgZWxlbWVudCB0aGF0IGFwcGVhcnMgb25jZSBiaW5hcnkgc2VhcmNo
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(FindsingleNumber(arr));
    }
    // EVEN only contains the duplicate like 4,4
    // ODD may contain the duplicate but definately contains the single element like 1,1,2
    public  static int FindsingleNumber(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }
            else if (nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 1){  // ODD
                     start = mid + 1;
                }
                else{
                    end = mid - 2;
                }

            } else {
                if (mid % 2 == 1){
                 end = mid - 1;
                }
                else {
                    start = mid + 2;
                }
            }
        }
        return nums[start];
    }
}
