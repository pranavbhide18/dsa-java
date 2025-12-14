package Arrays.part8;
import java.util.Arrays;

public class MaxSubarraySum {

    void main() {
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
        System.out.println(Arrays.toString(FindMaxxSubArray(nums)));
    }

    // Kadane' algorithm - Optimal
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) sum = 0;
        }

        return Math.max(max, 0);
    }

    public int[] FindMaxxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int left = -1;
        int right = -1;

        for(int i = 0; i < nums.length; i++) {

            if(sum == 0) start = i;

            sum += nums[i];

            if(sum > max) {
                max = sum;
                left = start;
                right = i;
            }

            if(sum < 0) sum = 0;
        }

        int[] result = new int[right - left + 1];
        for(int i = left; i <= right; i++)  {
            result[i- left] = nums[i];
        }

        return result;
    }


    // Brute
    public int maxSubArray1(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }

        return max;
    }
}
