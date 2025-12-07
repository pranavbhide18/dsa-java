package Arrays;

public class CheckSorted {
    void main() {
//        int[] arr = {5,1,1,2,3,3,4};
        int[] arr = {3,4,5,1,2};
        int[] arr2 = {1,1,2,2,4,3,3,4, 5};
        System.out.println(checkSorted(arr));

    }

    static boolean checkSorted(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) return false;
        }

        return true;
    }
}
