package recursion;

public class StringPalindrome {
    void main() {
        System.out.println(isPalindrome("wo1oow", 0));
    }

    static boolean isPalindrome(String s, int i) {
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        return isPalindrome(s, i + 1);
    }
}
