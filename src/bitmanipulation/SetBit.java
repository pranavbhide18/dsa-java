package bitmanipulation;

public class SetBit {
    void main() {
        System.out.print(setBit(9, 2));
    }

    static int setBit(int n, int i) {
        return n | (1 << i);
    }
}
