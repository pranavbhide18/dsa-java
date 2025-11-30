package basics;

public class IsPrime {
    void main() {
        int num = 11;
        System.out.println(checkPrime(num));
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for(int i = 3; i * i <= n; i+=2) {
            if(n % i == 0) return false;
        }

        return true;
    }
}
