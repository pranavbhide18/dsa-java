package recursionAdvanced;

public class RemoveLetter {
    void main() {
        String s = "baccad";
        char ch = 'a';
//        System.out.println(removeLetter(s, ch));

        String s1 = "bcdapplerfgh";
        String x = "apple";
        System.out.println(removeString(s1, x));

    }

    public static String removeLetter(String s, char ch) {
        return removeLetter(s, 0, ch);
    }

    private static String removeLetter(String s, int i, char ch) {
        if(i == s.length()) return "";

        char curr = s.charAt(i);

        if(curr == ch) {
            return removeLetter(s, i + 1, ch);
        }

        return curr + removeLetter(s, i + 1, ch);
    }

    public static String removeString(String s, String x) {
        if(x.isEmpty()) return s;
        return removeString(s, 0, x);
    }

    private static String removeString(String s, int i, String x) {
        if(i == s.length()) return "";

        if(s.startsWith(x, i)) {
            return removeString(s, i + x.length(), x);
        }

        return s.charAt(i) + removeString(s, i + 1, x);
    }
}
