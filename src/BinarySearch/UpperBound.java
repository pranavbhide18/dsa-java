package BinarySearch;

public class UpperBound {
    void main() {
//        int[] nums = {1, 2, 3, 3, 7, 8, 9, 10, 10, 11};
        int[] nums = {3,5,8,9,15,19};
        System.out.println(upperBound(nums, 9));
    }

    static int upperBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
