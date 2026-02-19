package strings;

import java.util.Stack;

public class RemoveOutermostParenthesis {
    void main() {
        String str = "(()())(())";
        System.out.println(removeOuterParentheses(str));

    }

    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int cnt = 0;

        if(s.length() <= 2) return "";

        for(char ch : s.toCharArray()) {

            if(ch == '('){
                if(cnt > 0) ans.append(ch);
                cnt++;

            } else {
                cnt--;
                if(cnt > 0) ans.append(ch);
            }
        }

        return ans.toString();
    }


    // Using O(n) space
    public static String removeOuterParentheses1(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder ans = new StringBuilder();

        if(s.length() <= 2) return "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '('){
                if(!stk.empty()) ans.append(ch);
                stk.push(ch);

            } else {
                stk.pop();
                if(!stk.empty()) ans.append(ch);
            }
        }

        return String.valueOf(ans);
    }
}
