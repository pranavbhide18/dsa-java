package basics;

import java.util.ArrayList;

public class ArrayListExample {
    void main() {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(24);
        list.add(67);
        list.add(6);
        list.add(23);
        list.add(032);

        System.out.println(list);

        list.set(0, 99);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(2));

    }
}
