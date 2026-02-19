package bitmanipulation;

public class SetUnsetRightMostBit {
    void main() {
        System.out.println(unsetRightMostBit(84));
    }

    static int unsetRightMostBit(int n) {
        return n & n - 1;
    }
}


