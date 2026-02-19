package strings;

import java.util.Stack;

public class ReverseWords {
    void main() {
//        String  s = "the  sky is blue";
        String  s = "the  pen  ";
        String str = "bus";
        System.out.println(reverseWords(s));
//        System.out.println(reverse(str));
    }


    public String reverseWords(String s) {
        Stack<String> stk = new Stack<>();
        int n = s.length();

        int i = 0;
        while(i < n) {
            StringBuilder word = new StringBuilder();
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            while (i < n && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }

            if (word.length() > 0) {
                stk.push(word.toString());
            }
        }
        StringBuilder ans = new StringBuilder();

        while (!stk.isEmpty()) {
            ans.append(stk.pop());
            if (!stk.isEmpty()) {
                ans.append(' ');
            }
        }

        return ans.toString();
    }

    public String reverseWords2(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        String rev = reverse(s.trim());
        int m = rev.length();


        for(int i = 0; i < m; i++) {
            StringBuilder word = new StringBuilder();
            while (i < m && rev.charAt(i) != ' ') {
                word.append(rev.charAt(i));
                i++;
            }

            String r = reverse(word.toString());
            if(r.length() > 0) {
                if (ans.length() > 0) ans.append(' ');
                ans.append(r);
            }
        }

        return ans.toString();
    }

    public static String reverse(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder(n);

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(n - i - 1);
            if(i > 0 && s.charAt(n - i) == ' ' && ch == ' ') continue;;
            ans.append(ch);
        }

        return ans.toString();
    }
}
