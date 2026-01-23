package BinarySearch;

public class CapacityToShip {
    void main() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.print(shipWithinDays(nums, days));



    }

    public static int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int num : weights) {
            low = Math.max(low, num);
            high += num;
        }
        int ans = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(possible(weights, mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean possible(int[] weights, int mid, int days) {
        int sum = 0, d = 1;

        for (int w : weights) {
            if (w > mid) return false;

            sum += w;
            if (sum > mid) {
                d++;
                sum = w;
            }
        }
        return d <= days;
    }

}
