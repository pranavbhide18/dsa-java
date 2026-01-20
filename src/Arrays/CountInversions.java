package Arrays;

public class CountInversions {
    void main() {
        int[] nums = {5,3,2,4,1};
        System.out.println(countInversions(nums, 0,nums.length - 1));
//        System.out.println(count(nums1,0, 3, nums1.length -1));
    }




    // BRUTE METHOD
    public static int countInversion(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] > nums[j]) count++;
            }
        }

        return count;
    }

    public static int countInversions(int[] nums, int start, int end) {
        int cnt = 0;

        if (start >= end) return cnt;

        int mid = (start + end) / 2;

        cnt += countInversions(nums, start, mid);
        cnt += countInversions(nums, mid + 1, end);

        cnt += merge(nums, start, mid, end);
        return cnt;
    }

    public static int merge(int[] nums, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k= 0;
        int[] temp = new int[end - start + 1];
        int cnt = 0;

        while(i <= mid && j <= end) {
            if(nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
                cnt += (mid - i + 1);
            }
        }

        while(i <= mid) {
            temp[k++] = nums[i++];
        }

        while(j <= end) {
            temp[k++] = nums[j++];
        }

        for(int l = start; l <= end; l++) {
            nums[l] = temp[l - start];
        }
        return cnt;
    }

    public static int count(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int i = 0;
        int j = 0;
        int count = 0;

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] > nums2[j]) {
                count += n - i;
                j++;
            } else {
                i++;
            }
        }

        return count;
    }

}
