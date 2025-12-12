package Arrays.part5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    void main() {
        int[] nums = {2,6,5,8,11};
        System.out.println(Arrays.toString(twoSum(nums, 14)));
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if(map.containsKey(j) && i != map.get(j)) return new int[]{i, map.get(j)};
            map.put(nums[i], i);
        }


        return new int[]{-1,-1};
    }

    static boolean twoSum2(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        while(i < j){
            if(nums[i] + nums[j] == target) return true;
            else if(nums[i] + nums[j] > target) j--;
            else i++;
        }

        return false;
    }

    // BRUTE FORCE
    static int[] twoSum1(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }

        return new int[]{-1,-1};
    }

}
