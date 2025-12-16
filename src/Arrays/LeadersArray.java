package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersArray {
    void main() {
        int[] nums = {10, 22, 12, 3, 0, 6};
//        int[] nums = {4, 7, 1, 0};
        System.out.println(findLeader(nums));
        System.out.println(findLeader1(nums));
    }

    static List<Integer> findLeader(int[] nums) {
        int n = nums.length;
        List<Integer> leaders = new ArrayList<>();
        int currentLeader = nums[n - 1];
        leaders.add(currentLeader);
        int i = n - 2;
        while(i >= 0) {
            if(nums[i] > currentLeader) {
                leaders.add(nums[i]);
                currentLeader = nums[i];
            }
            i--;
        }

        return leaders;
    }

    static List<Integer> findLeader1(int[] nums) {
        int n = nums.length;
        List<Integer> leaders = new ArrayList<>();
        int currentLeader = Integer.MIN_VALUE;
        int i = n - 1;
        while(i >= 0) {
            if(nums[i] > currentLeader) {
                leaders.add(nums[i]);
                currentLeader = nums[i];
            }
            i--;
        }

        return leaders;
    }
}
