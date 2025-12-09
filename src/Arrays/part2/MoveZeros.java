package Arrays.part2;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {
    void main() {
        int[] nums = {1,0,2,3,2,0,0,4,5,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int j = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i = j + 1; i < nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }



    static void moveZero2(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) temp.add(nums[i]);
        }

        for(int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }

        for(int i = temp.size(); i < n; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while(j < n) {

            while(i < n && j < n && nums[i] != 0) {
                i++;
                j++;
            }
            while(j < n && nums[j] == 0){
                j++;
            }
            if(j >= n) return;
            swap(nums, i, j);
            i++;
            j++;
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}
