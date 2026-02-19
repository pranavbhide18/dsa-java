package bitmanipulation;

public class PowerOf2 {
    void main() {
        System.out.println(power2(19));
    }

    static boolean power2(int n) {
        return (n & (n - 1)) == 0;
    }
}
