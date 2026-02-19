package linkedlist;
import linkedlist.FindLengthOfLoop.ListNode;
public class RemoveNthNodeFromBack {
    void main() {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;

        int cnt = 0;
        ListNode temp = head;

        while(temp != null) {
            temp = temp.next;
            cnt++;
        }

        if(cnt ==  n) return head.next;

        int rem = cnt - n;

        temp = head;
        while(temp != null) {
            rem--;
            if(rem == 0) break;
            temp= temp.next;
        }

        temp.next = temp.next.next;

        return head;


    }
}
