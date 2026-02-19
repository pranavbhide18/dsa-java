package BinarySearch;

public class PaintersPartition {
    void main() {

    }

    public static int painterPartition(int[] nums, int k) {
        if (nums.length < k) return -1;

        int low = 0, high = 0;
        for (int num : nums) {
            low = Math.max(low, num); // at least max book
            high += num;              // at most sum of all
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(nums, mid, k)) {
                ans = mid;
                high = mid - 1;   // minimize
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean possible(int[] nums, int mid, int m) {
        int st = 1, pages = 0;

        for (int num : nums) {
            if (pages + num <= mid) {
                pages += num;
            } else {
                st++;
                pages = num;
            }
        }

        return st <= m;
    }
}
