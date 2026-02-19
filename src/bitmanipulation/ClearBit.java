package bitmanipulation;

public class ClearBit {
    void main() {
        System.out.print(clearBit(13, 2));
    }

    static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

}
