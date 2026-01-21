package BinarySearch;

public class FirstAndLastOccurence {
    void main() {

    }

    public static int[] searchRange(int[] nums, int x) {
        int l = lowerBound(nums, x);
        if(l == nums.length || nums[l] != x) return new int[] {-1, -1};

        int u = upperBound(nums, x);
        return new int[] {l, u};
    }

    public static int countOccurence(int[] nums, int target) {
        int l = lowerBound(nums, target);
        if(l == nums.length || nums[l] != target) return 0;

        int u = upperBound(nums, target);
        return (u - l + 1);
    }

    public static int lowerBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int upperBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

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
