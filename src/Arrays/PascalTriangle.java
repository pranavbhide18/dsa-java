package Arrays;

import java.util.List;
import java.util.ArrayList;
public class PascalTriangle {

    void main() {

        System.out.println(nCr(10,3));
        System.out.println(findPascalRow(6));
    }


    // find any element at row N and column R in Pascal Triangle
    static long nCr(int n, int r) {
        long res = 1;
        n = n - 1;
        r = r - 1;
        for(int i = 0; i < Math.min(r, n - r); i++) {
            res = res * (n - i);
            res = res / (i  + 1);
        }

        return res;
    }

    static List<Long> findPascalRow(int n){
        List<Long> row = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            row.add(nCr(n, i));
        }

        return row;
    }
}
