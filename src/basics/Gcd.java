package basics;

public class Gcd {
    void main() {
        int n1 = 90;
        int n2 = 46;
        System.out.println(findGcd(n1, n2));
        System.out.println(findGcdOpt(n1, n2));
    }


    public static int findGcdOpt(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static int findGcd(int num1, int num2) {
        if(num1 == 1 || num2 == 1) return 1;
        int gcd = 1;
        for(int i = 2; i <= Math.min(num1, num2); i++) {
            if(num1 % i == 0 && num2 % i == 0) gcd = i;
        }

        return gcd;
    }
}
