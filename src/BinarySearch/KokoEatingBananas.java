package BinarySearch;

public class KokoEatingBananas {
    void main() {

    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int num : piles) high = Math.max(num, high);


        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int time = findTime(piles, mid);

            if(time <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int findTime(int[] nums, int k) {
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += Math.ceil((nums[i] + k - 1)/k);
        }

        return total;
    }

}
