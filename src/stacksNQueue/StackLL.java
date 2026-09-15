package stacksNQueue;

import java.util.Stack;

public class StackLL {
    void main() {
        String s = "()(){}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
