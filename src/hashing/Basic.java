package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Basic {
    void main() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Adam", 89);
        map.put("Jimmy", 79);
        map.put("Eve", 99);

        System.out.println(map.get("Eve"));

        HashSet set = new HashSet<Integer>();
        set.add(56);
        set.add(24);
        set.add(24);
        set.add(24);
        set.add(64);
        set.add(38);

        System.out.println(set);
    }
}
