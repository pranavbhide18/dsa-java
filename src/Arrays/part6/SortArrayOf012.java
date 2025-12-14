package Arrays.part6;

import java.util.Arrays;

public class SortArrayOf012 {
    void main() {
        int[] nums = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        sortArray(nums);
        sortUsing3pointer(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortArray(int[] nums) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) cnt0++;
            else if(nums[i] == 1) cnt1++;
            else cnt2++;
        }

        int i = 0;
        while(cnt0-- > 0) nums[i++] = 0;

        while(cnt1-- > 0) nums[i++] = 1;

        while(cnt2-- > 0) nums[i++] = 2;
    }

    static void sortUsing3pointer(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 1 ){
                mid++;
            } else {
                swap(nums, mid , high);
                high--;
            }
        }

    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =temp;
    }
}
