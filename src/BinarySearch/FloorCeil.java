package BinarySearch;
import java.util.Arrays;
public class FloorCeil {
    void main() {
        int[] nums = {1, 2, 3, 4, 7, 8, 9, 10, 11};
//        int[] nums = {3,5,8,9,15,19};
        System.out.println(Arrays.toString(FindFloorAndCeil(nums, 6)));
    }

    static int[] FindFloorAndCeil(int[] nums, int target) {
        return new int[] {
            findFloor(nums, target),
            findCeil(nums, target),
        };
    }

    static int findFloor(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] <= target) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return nums[ans];
    }

    static int findCeil(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return nums[ans];
    }
}
