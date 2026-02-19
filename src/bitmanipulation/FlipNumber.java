package bitmanipulation;

public class FlipNumber {
    void main() {
        System.out.println(countBits(13));
    }

    static int countBits(int n) {
        int cnt = 0;

        while(n != 0) {
            cnt += n & 1;
            n = n >>> 1;
        }

        return cnt;
    }
}
