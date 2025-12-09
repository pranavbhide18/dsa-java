package Arrays.part3;

public class FindMissingNum {
    void main() {
        int[] nums = {8,6,4,2,3,5,7,0,1};
//        int[] nums = {1,2};

//        System.out.println(missingNumber(nums));
        System.out.println(missingNumber(nums));
        System.out.println(missingNumber1(nums));
    }


    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n *(n + 1))/2;
        int sum1 = 0;

        for(int i = 0; i < n; i++) {
            sum1 += nums[i];
        }

        return sum - sum1;
    }

    public int missingNumber1(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ i;
        }

        xor2 = xor2 ^ nums.length;
        return xor1 ^ xor2;

    }

    public int missingNum(int[] nums) {
        int[] hash = new int[nums.length + 1];
        int miss = -1;

        for(int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        for(int i = 0; i < hash.length; i++) {
            if(hash[i] == 0) {
                miss = i;
                return miss;
            }
        }
        return -1;
    }
}
