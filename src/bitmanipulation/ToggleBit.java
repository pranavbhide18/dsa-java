package bitmanipulation;

public class ToggleBit {
    void main() {
        System.out.println(toggleBit(13, 2));
        System.out.println(toggleBit(13, 1));
    }

    static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }
}
