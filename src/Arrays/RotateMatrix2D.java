package Arrays;

import java.util.Arrays;

public class RotateMatrix2D {
    void main() {
        int[][] nums = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotate(nums);
        System.out.println(Arrays.deepToString(nums));
    }

    // Optimal - first transpose and then reverse rows
    public void rotate(int[][] nums) {
        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                swap(nums, i, j);
            }
        }

        for(int i = 0; i < n; i++) {
            reverse(nums[i]);
        }
    }
    static void reverse(int[] nums){
        int i = 0;
        int j = nums.length - 1;

        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void swap(int[][] nums, int i, int j) {
        int temp = nums[i][j];
        nums[i][j] = nums[j][i];
        nums[j][i] = temp;
    }


    // Brute
    public void rotate1(int[][] matrix) {
        int n = matrix.length;

        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                result[j][n - i - 1] = matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(result));
    }
}
