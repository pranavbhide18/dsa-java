package Arrays;
import java.util.Arrays;
public class FindRepeatAndMissingNum {
    void main() {
//        int[] nums = {3,5,4,1,1};
        int[] nums = {1, 2, 3, 6, 7, 5, 7};
        System.out.println(Arrays.toString(findMissingAndRepeat(nums)));


    }

    // OPTIMAL 2
    public static int[] findMissingAndRepeat(int[] nums) {
        int n = nums.length;


        int s = (n * (n + 1))/2;
        int s2 = n * (n + 1) * (2 * n + 1) / 6;

        int sn = 0;
        int s2n = 0;

        for(int num : nums) {
            sn += num;
            s2n += num*num;
        }

        int eq1 = s - sn;
        int eq2 = (s2 - s2n)/eq1;

        int repeat = (eq1 + eq2)/2;
        int missing = repeat - eq1;

        return new int[] {repeat, missing};

    }



    // BETTER NUMBER
    public static int[] findMissingAndRepeat1(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n + 1];
        int missing = 0;
        int repeat = 0;
        for (int num : nums) {
            hash[num]++;
            if (hash[num] > 1) repeat = num;
        }

        for(int i = 1; i < hash.length; i++) {
            if(hash[i] == 0) return new int[]{repeat, i};
        }
        return new int[] {-1, -1};
    }
}
