package Arrays;

public class ReversePairs {
    void main() {
        int[] nums = {3,2,1,4};
        System.out.println(reversePairs(nums));
    }

    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length -1);
    }

    static int mergeSort(int[] arr, int start, int end) {
        int cnt = 0;
        if(start >= end) return cnt;

        int mid = start + (end - start)/2;

        cnt += mergeSort(arr, start, mid);
        cnt += mergeSort(arr, mid + 1, end);
        cnt += count(arr, start, mid, end);
        merge(arr, start, mid, end);

        return cnt;
    }

    static int count(int[] nums, int start, int mid, int end) {
        int right = mid + 1;
        int cnt = 0;

        for(int i = start; i <= mid; i++) {
            while(right <= end && nums[i] > 2 * nums[right]) {
                right++;
            }

            cnt += right - (mid + 1);
        }

        return cnt;
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end) {

            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int x = start; x <= end; x++) {
            arr[x] = temp[x - start];
        }

    }
}
