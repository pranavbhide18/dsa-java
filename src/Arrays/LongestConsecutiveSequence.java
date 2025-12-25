package Arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    void main() {
//        int[] nums = {102,4,100,1,101,3,2,1,1};
//        int[] nums = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        int[] nums = {1, 2, 2, 3};
        System.out.println(longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int lastSmall = Integer.MIN_VALUE;
        int count = 1;
        int maxLen = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == lastSmall) {
                continue;
            }

            if(nums[i] - 1 == lastSmall) {
                count++;
            } else {
                maxLen = Math.max(maxLen, count);
                count = 1;
            }

            lastSmall = nums[i];
        }


        maxLen = Math.max(maxLen, count);
        return maxLen;
    }


    public int longestConsecutive1(int[] nums) {
        Arrays.sort(nums);
        int len = 1;
        int maxLen = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] - nums[i] == 1){
                len++;
            } else {
                maxLen = Math.max(maxLen, len);
                len = 1;
            }
        }

        return maxLen;
    }
}
