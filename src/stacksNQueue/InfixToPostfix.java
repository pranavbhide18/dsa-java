package stacksNQueue;

import java.util.Stack;

public class InfixToPostfix {
    void main() {
        String s = "a+b*(c^d-e)";
        System.out.println(infixToPostfix(s));
    }

    static String infixToPostfix(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        int i = 0;

        while(i < s.length()) {
            char ch = s.charAt(i);
            if(isOperand(ch)) {
                ans.append(ch);
            } else if(ch == '(') {
                stk.push(ch);
            } else if(ch == ')') {
                while(!stk.isEmpty() && stk.peek() != '(') {
                    ans.append(stk.pop());
                }
                stk.pop();
            } else {
                while (!stk.isEmpty() && priority(ch) <= priority(stk.peek())) {
                    ans.append(stk.pop());
                }
                stk.push(ch);
            }

            i++;
        }

        while(!stk.isEmpty()) {
            ans.append(stk.pop());
        }

        return ans.toString();
    }

    public static boolean isOperand(char ch) {
        return (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9'));
    }

    public static int priority(char ch) {
        if(ch == '^') return 3;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '+' || ch == '-') return 1;
        else return -1;
    }

}
