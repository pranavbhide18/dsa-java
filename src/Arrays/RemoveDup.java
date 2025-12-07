package Arrays;

import java.util.Arrays;

public class RemoveDup {
    void main() {
        int[] arr = {1,1,2,2,2,3,3};
        remove(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(removeCnt(arr));
    }

    static int removeCnt(int[] nums) {
        int i = 0;
        int j = i + 1;


        while(j < nums.length) {
            if(nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;

            }
            j++;
        }

        return i + 1;
    }



    static void remove(int[] arr) {
        int i = 0;
        int j = i + 1;


        while(j < arr.length) {
            if(arr[i] == arr[j]) j++;
            else {
                arr[i + 1] = arr[j];
                i = i + 1;
            }
        }
    }



}
