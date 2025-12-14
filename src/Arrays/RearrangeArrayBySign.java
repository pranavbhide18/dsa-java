package Arrays;
import java.util.*;

public class RearrangeArrayBySign {
    void main() {
//        int[] nums = {3,1,-2,-5,2,-4};
        int[] nums = {1,2,-4,-5,3,6};
//        int[] nums = {1,-1};
//        System.out.println(Arrays.toString(rearrangeArray(nums)));
        System.out.println(Arrays.toString(rearrangeArray1(nums)));
    }

    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result[pos] = nums[i];
                pos += 2;
            } else {
                result[neg] = nums[i];
                neg += 2;
            }
        }

        return result;
    }

    public int[] rearrangeArray1(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }

        int min = Math.min(pos.size(), neg.size());

        for(int j = 0; j < min; j++) {
            result[2*j] = pos.get(j);
            result[2*j + 1] = neg.get(j);
        }

        int i = min * 2;
        int p = min, n = min;

        while (p < pos.size()) {
            result[i++] = pos.get(p++);
        }

        while (n < neg.size()) {
            result[i++] = neg.get(n++);
        }

        return result;
    }
}
