package bitmanipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber2 {
    void main() {
        int[] nums = {0,1,0,1,0,1,99};
        System.out.println(singleNumber(nums));
//        System.out.println(7 % 3);
    }


    static int singleNumberBrute(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) return entry.getKey();
        }

        return -1;
    }

    public int singleNumberBetter(int[] nums){
        int ans = 0;
        for(int i = 0; i <= 31; i++) {
            int cnt = 0;
            for(int num : nums) {
                if ((num & (1 << i)) != 0) cnt++;
            }

            if(cnt % 3 == 1) {
                ans = ans | (1 << i);
            }
        }

        return ans;
    }

    static int singleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n - 1] != nums[n - 2]) return nums[n - 1];

        for(int i = 1; i < nums.length - 1; i += 3) {
             if(nums[i] != nums[i - 1]) return nums[i - 1];
        }

        return -1;
    }
}
