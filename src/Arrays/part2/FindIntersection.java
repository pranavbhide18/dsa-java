package Arrays.part2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
    void main() {
        int[] a = {1,1,2,2,3,4,4,5};
        int[] b = {2,2,3,4,4,5,6,7,8,8,9};

        int[] x = {1,2,2,3,3,4,5,6};
        int[] y = {2,3,3,5,6,6,7};

//        System.out.println(Arrays.toString(findUnion1(a,b)));
        System.out.println(findIntersection(a,b));
        System.out.println();
        System.out.println(findIntersection(x,y));
    }


    static List<Integer> findIntersection(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length) {
            if(a[i] == b[j]) {
                if(list.isEmpty() || list.getLast() != a[i]) { // remove this if condition if repetition of values is allowed i.e if a has two 2s and b has two 2s then both will be inserted in result
                    list.add(a[i]);
                }
                i++;
                j++;
            } else if(a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return list;
    }

}
