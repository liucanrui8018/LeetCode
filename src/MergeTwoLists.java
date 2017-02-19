
public class MergeTwoLists {

	// Merge two sorted linked lists and return it as a new list. The new list
	// should be made by splicing together the nodes of the first two lists.
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode mergeHead;
		if (l1.data < l2.data) {
			mergeHead = l1;
			mergeHead.next = mergeTwoLists(l1.next, l2);
		} else {
			mergeHead = l2;
			mergeHead.next = mergeTwoLists(l1, l2.next);
		}
		return mergeHead;
	}
}