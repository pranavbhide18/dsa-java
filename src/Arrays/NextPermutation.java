package Arrays;

import java.util.Arrays;

public class NextPermutation {
    void main() {
//        int[] nums = {1,2,3,4,5};
        int[] nums = {2,1,5,4,3,0,0};
//        int[] nums = {5,4,3,2,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void nextPermutation(int[] nums) {
        int p = -1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                break;
            }
        }

        if(p == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }



        for(int i = nums.length - 1; i > p; i--) {
            if(nums[i] > nums[p]) {
                swap(nums, i, p);
                break;
            }
        }

        reverse(nums, p + 1, nums.length - 1);
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start, int end) {
        while(start <= end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

}

