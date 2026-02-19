package bitmanipulation;

public class CountSetBits {
    void main() {
        System.out.println(setBits(-13));

    }

    static int setBits(int n) {
        int cnt = 0;

        while (n != 0) {
            cnt += (n & 1);
            n = n >>> 1;   // unsigned shift
        }

        return cnt;
    }
}
