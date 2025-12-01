package recursion;

public class Fibonacci {
    void main() {
        int n = 4;
        System.out.println(fibo(n));
    }

    static int fibo(int n) {
        if(n <= 1) return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
