package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Divisors {
    void main() {
        int num = 20;
        System.out.println(divisors(num));
        System.out.println(divisorsOpt(num));
    }

    public static List<Integer> divisors(int x) {
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i < x; i++) {
            if(x % i== 0) result.add(i);
        }
        result.add(x);
        return result;
    }

    public static List<Integer> divisorsOpt(int x) {
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i*i <= x; i++) {
            if(x % i== 0) {
                result.add(i);
                if(i != x / i) result.add(x/i);
            }
        }

        Collections.sort(result);
        return result;
    }
}
