package bitmanipulation;

import java.util.Arrays;

public class SingleNumber3 {
    void main() {
        int[] nums = {2,4,2,14,3,7,7,3};
        System.out.print(Arrays.toString(singleNumber(nums)));
    }

    static int[] singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res ^= num;
        }


        long rightBit = (res & (res - 1)) ^ res;

        int b1 = 0;
        int b2 = 0;

        for(int num : nums) {
            if((num & rightBit) != 0) {
                b1 ^= num;
            } else {
                b2 ^= num;
            }
        }

        return new int[] {b1, b2};
    }
}
