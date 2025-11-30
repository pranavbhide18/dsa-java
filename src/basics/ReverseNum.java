package basics;

public class ReverseNum {
    public static void main(String[] args) {
        int num = -123;

        System.out.println(reverse(num));
    }

    public static int reverseOpt(int x) {
        long reverse = 0;
        while(x != 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }

        return (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) ? 0 : (int)(reverse);
    }

    public static int reverse(int x) {
        int sign = x > 0 ? 1 : -1;
        x = Math.abs(x);
        long reverse = 0;
        while(x > 0) {
            reverse = (reverse * 10) + (x % 10);
            if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) return 0;
            x = x / 10;
        }

        return (int)(sign * reverse);
    }


}
