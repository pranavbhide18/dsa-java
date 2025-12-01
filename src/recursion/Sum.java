package recursion;

public class Sum {
    void main() {
        int n = 4;
//        sumPara(n, 0);
        System.out.println("SUM: " + sumFunc(n));
        System.out.println("Factorial: " + factorial(n));
    }

    public static void sumPara(int n, int sum) {
        if(n < 1) {
            System.out.println(sum);
            return;
        }
        sumPara(n - 1, sum + n);
    }

    public static int sumFunc(int n) {
        if(n <= 1){
            return n;
        }
        return n + sumFunc(n - 1);
    }

    static int factorial(int n) {
        if(n <= 1) return n;
        return n * factorial(n - 1);
    }



}
