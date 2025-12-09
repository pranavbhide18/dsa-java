package Arrays.part2;

import java.util.*;

public class FindUnion {
    void main() {
        int[] a = {1,1,2,3,4,5};
        int[] b = {2,3,4,4,5,6,7,8,8,9};

//        System.out.println(Arrays.toString(findUnion1(a,b)));
        System.out.println(findUnion(a,b));
    }

    static List<Integer> findUnion(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) {
                if(list.size() == 0 || list.getLast() != a[i]){
                    list.add(a[i]);
                }
                i++;
            }else {
                if(list.size() == 0 || list.getLast() != b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }

        while(i < a.length) {
            if(list.size() == 0 || list.getLast() != a[i]){
                list.add(a[i]);
            }
            i++;
        }

        while(j < b.length) {
            if(list.size() == 0 || list.getLast() != b[j]){
                list.add(b[j]);
            }
            j++;
        }

        return list;
    }


    static int[] findUnion1(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();

        for(int x = 0; x < a.length; x++) {
            set.add(a[x]);
        }

        for(int x = 0; x < b.length; x++) {
            set.add(b[x]);
        }

        int[] result = new int[set.size()];

        int i = 0;
        for(int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
