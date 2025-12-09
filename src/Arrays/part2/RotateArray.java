package Arrays.part2;

import java.util.Arrays;

public class RotateArray {
    void main() {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] nums2 = {1,2,3,4,5,6,7,8,9};
//        rotateBy1(nums);
        rotateLeftByD(nums, 4);
        rotateRightByD(nums2, 4);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }


    static void rotateLeftByD(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    static void rotateRightByD(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
