package recursion;

import java.util.ArrayList;
import java.util.List;

public class ArraySubset {
    void main() {
        int[] nums = {1,2,3, 4};
        System.out.println(subsets(nums));
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int subset = 1 << nums.length;

        for(int i = 0; i < subset; i++) {
            List<Integer> temp = new ArrayList<>();

            for(int j = 0; j < nums.length; j++) {
                if((i & (1 << j)) != 0) temp.add(nums[j]);
            }

            list.add(temp);
        }

        return list;
     }


}
