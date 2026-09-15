package stacksNQueue;

public class QueueUsingArray {
    int size = 10;
    int cSize = 0;
    int start = -1;
    int end = -1;
    int[] q = new int[size];

    void push(int val)  {
        if(cSize == size) {
            System.out.println("Queue full");
            return;
        }
        if(cSize == 0) {
            start = 0;
            end = 0;
        } else {
            end = end + 1;
        }
        q[end] = val;
        cSize++;
    }

    int pop() {
        if(cSize == 0) {
            System.out.print("Queue empty");
            return -1;
        }

        int el = q[start];
        if(cSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % size;
        }
        cSize--;
        return el;
    }

    int top() {
        if(cSize == 0) {
            System.out.println("Queue empty");
            return -1;
        }

        return q[start];
    }

    int size() {
        return cSize + 1;
    }
}
