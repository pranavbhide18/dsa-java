package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    void main() {
        int[] nums = {0,3,4,7,9,10};
        int k = 2;
        System.out.println(aggressiveCow(nums, k));

    }

    public static int aggressiveCow(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 1;
        int high = nums[nums.length - 1] - nums[0];

        if(k == 2) return nums[nums.length - 1] - nums[0];


        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(possible(nums, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static boolean possible(int[] nums, int k, int mid) {
        int prev = 0;
        int cnt = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[prev] >= mid) {
                prev = i;
                cnt++;
            }

            if(cnt >= k) return true;
        }

        return false;
    }
 }
