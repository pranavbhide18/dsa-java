package Arrays.part3;

public class MaximumConsecutive1s {
    void main() {
        int[] nums = {1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                if(max < count) max = count;
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}
