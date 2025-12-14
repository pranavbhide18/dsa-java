package Arrays.part7;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    void main() {
//        int[] nums = {2,2,1,1,1,2,2};
        int[] nums = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
//        System.out.println(majorityElement(nums));
        System.out.println(majorityElementUsingMoresAlgo(nums));
    }

    static int majorityElementUsingMoresAlgo(int[] nums) {
        int e = nums[0];
        int cnt = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == e) cnt++;
            else if(cnt == 0) {
                e = nums[i];
                cnt = 1;
            }
            else cnt--;
        }

        // if majority always exists dont run below loop. Just return e;
        cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == e) cnt++;
        }

        return cnt > nums.length/2 ? e : -1;
    }

    static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > (nums.length/2)) return nums[i];
        }

        return -1;
    }
}
