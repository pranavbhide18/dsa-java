package Arrays.part4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {
    // sub array is a contiguous part of the array i.e an array made from consecutive elements
    void main() {
        int[] nums1 = {1,2,3,4};
//        int[] nums = {1,2,3,1,1,1,1,4,2,3};
        int[] nums = {10, 5, 2, 7, 1, };
//        int[] nums = {2,0,0,3};

//        System.out.println(longestSubArrayBetter(nums, 3));
        System.out.println(longestSubArrayOptimal(nums, 15));
    }


    static int longestSubArrayOptimal(int[] nums, int a) {
        int left = 0;
        int right = 0;

        int sum = 0;
        int maxLen = 0;
        while(right < nums.length) {

            sum += nums[right];

            while(sum > a && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == a) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }


    // This is the better solution for positives only case and is the optimal solution with 0s and negatives
    static int longestSubArrayBetter(int[] nums, int a) {
        Map<Long, Integer> map = new HashMap<>();

        long sum = 0;
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum == a) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - a;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }


    static int longestSubArrayBruteN2(int[] nums, int a) {

        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == a) len = Math.max(len, j - i + 1);
            }
        }

        return len;
    }

    static int longestSubArrayBruteN3(int[] nums, int a) {

        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum == a) len = Math.max(len, j - i + 1);
            }
        }

        return len;
    }


    static ArrayList<ArrayList<Integer>> generateSubarray(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                ArrayList<Integer> subArray = new ArrayList<>();
                for(int k = i; k <= j; k++) {
                    subArray.add(nums[k]);
                }
                result.add(subArray);
            }
        }

        return result;
    }
}
