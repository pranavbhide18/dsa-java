package linkedlist;



public class FindLengthOfLoop {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    void main() {

    }

    public int detectCycle(ListNode head) {
        if(head == null || head.next == null) return 0;

        ListNode slow = head;
        ListNode fast = head;
        ListNode start = null;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                int length = 1;
                ListNode temp = slow.next;

                while(slow != temp) {
                    length++;
                    temp = temp.next;
                }
                return length;
            }
        }

        return 0;
    }
}
