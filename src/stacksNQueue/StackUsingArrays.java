package stacksNQueue;

public class StackUsingArrays {
    int[] stk = new int[10];
    int top = -1;
    int size = 10;

    void push(int x) {
        if(top >= size) {
            System.out.print("stack full");
            return;
        }
        top++;
        stk[top] = x;
    }

    int top() {
        if(top == -1){
            System.out.print("stack empty");
            return - 1;
        }
        return stk[top];
    }

    int pop() {
        if(top == -1) {
            return -1;
        }

        return stk[top--];
    }

    int size() {
        return top + 1;
    }
}
