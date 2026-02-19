package recursionAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateSubSets {
    void main() {
        String s = "abc";
        int[] arr = {1,2,3};

        System.out.println(subset(s));
//        subset(s);
    }


    public static List<String> subset(String s) {
        return subset("", s);
    }
    public static List<String> subset(String p, String up) {
        if(up.isEmpty()) {
            List<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }

        String p1 = p + up.charAt(0);
        String up1 = up.substring(1);

        var left = subset(p1, up1);
        var right = subset(p, up1);

        left.addAll(right);
        return left;
    }

}
