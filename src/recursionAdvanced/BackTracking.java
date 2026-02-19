package recursionAdvanced;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {
    void main() {
         System.out.println(count(3,3));
         System.out.println(printPath("", 3,3));
         int[][] arr = {
                 {1,1,1,1},
                 {1,1,0,1},
                 {1,0,1,1},
                 {1,1,1,1}
         };

         System.out.println(printPathWithObstacle("",arr, 0, 0));
         System.out.println(printPathWithObstacleDiagonal("",arr, 0, 0));
    }

    static int count(int row, int col) {
        if(row == 1 || col == 1) return 1;

        int left = count(row - 1, col);
        int right = count(row, col - 1);

        return left + right;
    }

    static List<String> printPath(String path, int row, int col) {
        if(row == 1 && col == 1) {
            List<String> temp = new ArrayList<>();
            temp.add(path);
            return temp;
        }
        List<String> list = new ArrayList<>();
        if(row > 1) {
            list.addAll(printPath(path + 'H', row - 1, col));
        }

        if(col > 1){
            list.addAll(printPath(path + 'V', row, col - 1));
        }

        if(row > 1 && col > 1) {
            list.addAll(printPath(path + 'D', row - 1, col - 1));
        }

        return list;
    }

    static int countPathWithObstacle(int[][] arr, int row, int col) {
        if(arr[row][col] == 0) return 0;

        if(row ==  arr.length - 1 && col == arr[0].length - 1) return 1;

        int left = 0; int right = 0;

        if(row < arr.length - 1) {
            left = countPathWithObstacle(arr, row + 1, col);
        }

        if(col < arr[0].length - 1) {
            right = countPathWithObstacle(arr, row, col + 1);
        }

        return left + right;
    }

    static int countPathWithObstacleDiagonal(int[][] arr, int row, int col) {

        if(arr[row][col] == 0) return 0;

        if(row ==  arr.length - 1 && col == arr[0].length - 1) return 1;

        int left = 0, right = 0, diag = 0;

        if(row < arr.length - 1) {
            left = countPathWithObstacleDiagonal(arr, row + 1, col);
        }

        if(col < arr[0].length - 1) {
            right = countPathWithObstacleDiagonal(arr, row, col + 1);
        }

        if(row < arr.length - 1 && col < arr[0].length - 1){
            diag = countPathWithObstacleDiagonal(arr, row + 1, col + 1);
        }

        return left + right + diag;
    }

    public List<String> printPathWithObstacle(String p,int[][] arr, int row, int col){
        if(arr[row][col] == 0) {
            List<String> list = new ArrayList<>();
            return list;
        }

        if(row == arr.length - 1 && col == arr[0].length - 1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();
        if(row < arr.length - 1) {
            list.addAll(printPathWithObstacle(p + 'V',arr, row + 1, col));
        }

        if(col < arr[0].length - 1) {
            list.addAll(printPathWithObstacle(p + 'H',arr, row, col + 1));
        }

        return list;
    }

    public List<String> printPathWithObstacleDiagonal(String p,int[][] arr, int row, int col){
        if(arr[row][col] == 0) {
            return new ArrayList<>();
        }

        if(row == arr.length - 1 && col == arr[0].length - 1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();
        if(row < arr.length - 1) {
            list.addAll(printPathWithObstacleDiagonal(p + 'V',arr, row + 1, col));
        }

        if(col < arr[0].length - 1) {
            list.addAll(printPathWithObstacleDiagonal(p + 'H',arr, row, col + 1));
        }

        if(row < arr.length - 1 && col < arr[0].length - 1){
            list.addAll(printPathWithObstacleDiagonal(p + 'D', arr, row + 1, col + 1));
        }

        return list;
    }

}
