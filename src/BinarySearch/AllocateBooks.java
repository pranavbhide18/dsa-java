package BinarySearch;

public class AllocateBooks {
    void main () {
        int[] books = {25,46,28,49,24};
        System.out.println(allocateBooks(books, 4));
    }

    public static int allocateBooks(int[] nums, int m) {
        if (nums.length < m) return -1;

        int low = 0, high = 0;
        for (int num : nums) {
            low = Math.max(low, num); // at least max book
            high += num;              // at most sum of all
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(nums, mid, m)) {
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
