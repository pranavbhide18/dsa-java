package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    void main() {
        int[] nums = {1,3,3,4};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        int a1 =  Integer.MIN_VALUE, a2 =  Integer.MIN_VALUE;
        int min = (int)nums.length/3;

        for(int i = 0; i < nums.length; i++) {
            if(cnt1 == 0 && nums[i] != a2) {
                a1 = nums[i];
                cnt1 = 1;
            } else if(cnt2 == 0 && nums[i] != a1) {
                a2 = nums[i];
                cnt2 = 1;
            }
            else if(a1 == nums[i]) cnt1++;
            else if(a2 == nums[i]) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0; cnt2 = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == a1) cnt1++;
            if(nums[i] == a2) cnt2++;
        }

        if(cnt1 > min) list.add(a1);
        if(cnt2 > min && a1 != a2) list.add(a2);
        return list;

    }
}
