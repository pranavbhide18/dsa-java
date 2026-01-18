package Arrays;
import java.util.Arrays;
public class MergeSortedArrays {
    void main() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
//        int[] nums1 = {2,0};
//        int[] nums2 = {1};
        int m = 1;
        int n = nums2.length;

        merge(nums1, 3, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        int j = m - 1;
        int k = n - 1;

        while(k >= 0) {
            if(nums1[j] <= nums2[k]) {
                nums1[i--] = nums2[k--];
            } else {
                nums1[i--] = nums1[j--];
            }
        }
    }
}
