package bitmanipulation;

public class XORofRangeN {
    void main() {

    }

    static int findXOR(int n) {
        if(n % 4 == 1) return 1;
        else if(n % 4 == 2) return n + 1;
        else if(n % 4 == 3) return 0;
        else return n;
    }

    static int finXORofRange(int left, int right) {
        int before = findXOR(left - 1);
        int full = findXOR(right);

        return before ^ full;
    }

}
