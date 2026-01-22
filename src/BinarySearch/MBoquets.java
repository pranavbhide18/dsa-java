package BinarySearch;

public class MBoquets {
    void main() {}


    public static int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1;

        int low = Integer.MAX_VALUE;;
        int high = 0;

        for(int num : bloomDay) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }
        int ans = high;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(possible(bloomDay, mid, k, m)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean possible(int[] nums, int mid, int k, int m) {
        int b = 0;
        int cnt = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] <= mid) cnt++;
            else {
                cnt = 0;
            }
            if(cnt == k){
                b++;
                cnt = 0;
            }
        }

        return b >= m;
    }
}
