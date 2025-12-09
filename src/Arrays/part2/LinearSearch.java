package Arrays.part2;

public class LinearSearch {
    void main() {
        int[] nums = {1,0,2,3,2,0,0,4,5,1};
        System.out.println(search(nums, 5));
    }

    static int search(int[] nums, int x) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == x) return i;
        }
        return -1;
    }
}
