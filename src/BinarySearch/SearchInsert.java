package BinarySearch;

public class SearchInsert {
    void main() {
        int[] nums = {1, 2, 3, 4, 7, 8, 9, 10, 11};
//        int[] nums = {3,5,8,9,15,19};
        System.out.println(upperBound(nums, 5));
    }

    static int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
