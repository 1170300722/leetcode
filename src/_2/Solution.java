package _2;

/**
 * Definition for singly-linked list.
 */
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode();
		ListNode start = result;
		while (l1 != null || l2 != null) {
			result.next = new ListNode();
			result = result.next;
			if (l1 == null) {
				l1 = new ListNode(0);
			}
			if (l2 == null) {
				l2 = new ListNode(0);
			}
			int tempsum = l1.val + l2.val;
			if (tempsum >= 10) {
				result.val = tempsum - 10;
				if (l1.next != null) {
					l1.next.val++;
				} else {
					l1.next = new ListNode(1);
				}
			} else {
				result.val = tempsum;

			}
			l1 = l1.next;
			l2 = l2.next;

		}
		return start.next;
	}
}