package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumXOR {
    void main() {
        int[] nums = {4, 4, 2, 2, 6, 4};
        System.out.print(sumArrayXor(nums, 6));
    }

    public static int sumArrayXor(int[] nums, int k) {
        int sum = 0;
        int cnt = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            sum ^= nums[i];

            if(sum == k) cnt++;

            int rem = sum^k;
            if(map.containsKey(rem)) {
                cnt += map.get(rem);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }
}
