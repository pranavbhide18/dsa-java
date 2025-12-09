package Arrays.part3;
import java.util.HashMap;
import java.util.Map;

public class FindSingleNumber {
    void main() {
        int[] nums = {1,1,2,3,3,4,4,};
        System.out.println(singleNumber(nums));
        System.out.println(singleNum(nums));
    }

    public int singleNumber(int[] nums) {
        int single = 0;

        for(int i = 0; i < nums.length; i++) {
            single = single ^ nums[i];
        }

        return single;
    }

    public int singleNum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int single = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
