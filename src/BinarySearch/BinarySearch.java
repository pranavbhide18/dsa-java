package BinarySearch;

public class BinarySearch {
    void main() {
//        int[] nums = {3, 4, 6, 7, 9, 12, 26, 17};
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(binarySearch(nums, 9));
        System.out.println(binarySearch(nums, 8));
        System.out.println("_______________________");
        System.out.println(binarySearch2(nums, 9));
        System.out.println(binarySearch2(nums, 8));
    }

    // ITERATIVE SOLUTION - return index
    static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low)/2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // RECURSIVE SOLUTION
    static int binarySearch2(int[] nums, int target) {
        return binarySearchRec(nums, 0, nums.length - 1, target);
    }

    static int binarySearchRec(int[] nums, int low, int high, int target) {
        if(low > high) return - 1;

        int mid = low + (high - low)/2;
        if(nums[mid] == target) return mid;

        if(nums[mid] < target) return binarySearchRec(nums, mid + 1, high, target);
        return binarySearchRec(nums, low, mid - 1, target);
    }
}
