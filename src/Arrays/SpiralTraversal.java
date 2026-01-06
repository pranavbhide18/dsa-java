package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SpiralTraversal {
    void main() {
        int[][] mat = { { 1, 2, 3, 4 },{ 5, 6, 7, 8 },{ 9, 10, 11, 12 },{ 13, 14, 15, 16 } };
        System.out.println(spiralOrder(mat));
    }

    public List<Integer> spiralOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int left = 0; int right = m - 1;
        int top = 0; int bottom = n - 1;

        List<Integer> list = new ArrayList<>();

        while(left <= right && top <= bottom) {
            for(int i = left; i <= right; i++) {
                list.add(mat[top][i]);
            }

            top++;

            for(int i = top; i <= bottom; i++) {
                list.add(mat[i][right]);
            }
            right--;

            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    list.add(mat[i][left]);
                }
                left++;
            }
        }

        return list;

    }


}
