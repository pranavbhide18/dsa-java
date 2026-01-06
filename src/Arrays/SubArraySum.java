package Arrays;

import java.util.HashMap;

public class SubArraySum {
    void main() {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, -2, 3};
        System.out.println(subarraySum(nums, 3));
    }

    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int cnt = 0;
        map.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int rem = sum - k;
            if(map.containsKey(rem)){
               cnt += map.get(rem);
            }

            if(map.containsKey(sum)) {
                int val = map.get(sum);
                map.put(sum, val + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return cnt;
    }
}
