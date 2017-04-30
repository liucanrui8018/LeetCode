/**
 * Created by 刘灿锐 on 2017/4/27 0027.
 * 142. Linked List Cycle II
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p>
 * Note: Do not modify the linked list.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode firstp = head;
        ListNode secondp = head;
        boolean isCycle = false;

        while (firstp != null && secondp != null) {
            firstp = firstp.next;
            if (secondp.next == null) return null;
            secondp = secondp.next.next;
            if (firstp == secondp) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle) return null;
        firstp = head;
        while (firstp != secondp) {
            firstp = firstp.next;
            secondp = secondp.next;
        }

        return firstp;
    }
}
