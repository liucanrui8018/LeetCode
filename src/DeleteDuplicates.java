/**
 * Created by 刘灿锐 on 2017/3/12 0012.
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class DeleteDuplicates {
    private ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        head.next = deleteDuplicates(head.next);
        return head.data == head.next.data ? head.next : head;
    }
}
