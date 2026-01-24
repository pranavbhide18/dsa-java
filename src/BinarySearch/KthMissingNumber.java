package BinarySearch;

public class KthMissingNumber {
    void main() {
        int[] nums = {1,2,3,4};
        System.out.println(findKthPositive(nums, 2));
    }

    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return k + high + 1;
    }


    // Brute Force - O(n)
    public int findKthPositive1(int[] arr, int k) {
        int ans = k;
        for(int num : arr) {
            if(num > ans) break;
            ans++;
        }

        return ans;
    }
}
