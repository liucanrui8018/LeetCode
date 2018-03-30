package Top100;

public class AddTwoNumbers {

//	2. Add Two Numbers
	// You are given two non-empty linked lists representing two non-negative
	// integers. The digits are stored in reverse order and each of their nodes
	// contain a single digit. Add the two numbers and return it as a linked
	// list.
	//
	// You may assume the two numbers do not contain any leading zero, except
	// the number 0 itself.
	//
	// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	// Output: 7 -> 0 -> 8

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode c1 = l1;
		ListNode c2 = l2;
		ListNode sentinel = new ListNode(0);
		ListNode d = sentinel;
		int sum = 0;
		while (c1 != null || c2 != null) {
			sum /= 10;
			if (c1 != null) {
				sum += c1.val;
				c1 = c1.next;
			}
			if (c2 != null) {
				sum += c2.val;
				c2 = c2.next;
			}
			d.next = new ListNode(sum % 10);
			d = d.next;
		}
		if (sum / 10 == 1)
			d.next = new ListNode(1);
		return sentinel.next;
	}

	public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null) p = p.next;
			if (q != null) q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
}
