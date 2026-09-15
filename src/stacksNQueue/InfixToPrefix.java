package stacksNQueue;

import java.util.Stack;

import static stacksNQueue.InfixToPostfix.isOperand;
import static stacksNQueue.InfixToPostfix.priority;

public class InfixToPrefix {
    void main()  {
//        String s = "a+b*(c^d-e)";
        String s = "(A+B)*C-D+F";
        System.out.println(infixToPrefix(s));
    }

    static String infixToPrefix(String s){
        String rev1 = reverse(s);
        rev1 = infixToPostfix(rev1);
        return reverse(rev1);
    }

    static String reverse(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            char left = arr[i];
            char right = arr[j];

            arr[i] = flip(right);
            arr[j] = flip(left);

            i++;
            j--;
        }

        return new String(arr);
    }

    static char flip(char ch) {
        if (ch == '(') return ')';
        if (ch == ')') return '(';
        return ch;
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
                if(ch == '^') {
                    while (!stk.isEmpty() && priority(ch) <= priority(stk.peek())) {
                        ans.append(stk.pop());
                    }
                } else {
                    while (!stk.isEmpty() && priority(ch) < priority(stk.peek())) {
                        ans.append(stk.pop());
                    }
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
}
