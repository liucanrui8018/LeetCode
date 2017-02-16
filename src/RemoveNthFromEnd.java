import java.util.List;

public class RemoveNthFromEnd {

	// Given a linked list, remove the nth node from the end of list and return
	// its head.
	//
	// For example,
	//
	// Given linked list: 1->2->3->4->5, and n = 2.
	//
	// After removing the second node from the end, the linked list becomes
	// 1->2->3->5.
	//

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		ListNode node3 = new ListNode(3);
		node2.next = node3;
		ListNode node4 = new ListNode(4);
		node3.next = node4;
		ListNode node5 = new ListNode(5);
		node4.next = node5;
		
		removeNthFromEnd(node1, 2);
		ListNode node = node1;
		while (node1.next != null) {
			System.out.print(node.data + "->");
			node = node.next;
			if (node.next == null) {
				System.out.print(node.data);
				break;
			}
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode start = new ListNode(0);
		ListNode slow = start, fast = start;
		slow.next = head;

		// Move fast in front so that the gap between slow and fast becomes n
		for (int i = 1; i <= n + 1; i++) {
			fast = fast.next;
		}
		// Move fast to the end, maintaining the gap
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		// Skip the desired node
		slow.next = slow.next.next;
		return start.next;
	}
}
