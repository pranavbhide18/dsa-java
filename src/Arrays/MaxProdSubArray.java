package Arrays;

public class MaxProdSubArray {
    void main() {
//        int[] nums = {1,2,-3,0,-4,-5};
        int[] nums = {1,2,3,4,5,0};
        System.out.println(maxProduct(nums));
    }

    static int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - i -1];

            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }
}
