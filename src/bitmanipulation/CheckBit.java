package bitmanipulation;

public class CheckBit {
    void main() {
        System.out.println(checkBitLeftShift(13, 2));
        System.out.println(checkBitRightShift(13, 2));
    }

    static boolean checkBitLeftShift(int n, int i) {
        int res = n & (1 << i);

        return res != 0;
    }

    static boolean checkBitRightShift(int n, int i) {
        int res = (n >> i) & 1;

        return res == 1;
    }

}
