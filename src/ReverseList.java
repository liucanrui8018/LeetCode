/**
 * Created by 刘灿锐 on 2017/3/16 0016.
 * Reverse a singly linked list.
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
    /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

}