/**
 * Created by 刘灿锐 on 2017/2/19 0019.
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */

public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null))
            return head;
        ListNode n = head.next; //2
        head.next = swapPairs(head.next.next);
        n.next = head; //2->1
        return n;
    }
}
