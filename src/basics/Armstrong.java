package basics;

public class Armstrong {
    public static void main(String[] args) {
        int num = 9474;
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int x) {
        int power = (int)Math.log10(x) + 1;
        int num = x;

        long sum = 0;
        while(x != 0) {
            sum +=  (long)Math.pow(x % 10, power);
            x /= 10;
        }

        return num == sum;
    }
}
