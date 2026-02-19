package linkedlist;
import linkedlist.FindLengthOfLoop.ListNode;

import java.util.Stack;

public class CheckPalindromw {
    void main() {}
    public boolean isPalindrome1(ListNode head) {
        Stack<ListNode> stk = new Stack<>();

        ListNode temp = head;
        while(temp != null) {
            stk.push(temp);
            temp = temp.next;
        }

        temp = head;
        while(!stk.isEmpty() && temp != null) {
            if(stk.pop().val != temp.val) return false;
        }

        return true;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverse(slow);
        ListNode temp = head;

        while(rev != null) {
            if(rev.val != temp.val) return false;
            temp = temp.next;
            rev = rev.next;
        }

        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
