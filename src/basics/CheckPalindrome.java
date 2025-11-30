package basics;

public class CheckPalindrome {
    public static void main(String[] args) {
        int num = 113311;
        System.out.println(checkPalindrome(num));
        System.out.println(checkPalindromeOpt(num));
    }

    public static boolean checkPalindromeOpt(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
        int y = x;

        int rev = 0;
        while(x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return x == rev || x == rev / 10;
    }

    public static boolean checkPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int rev = 0;
        while(x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return y == rev;
    }
}
