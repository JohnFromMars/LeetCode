package com.john.leetcode.app;

/**
 * 19. Remove Nth Node From End of List. Given a linked list, remove the nth
 * node from the end of list and return its head.
 * 
 * @author user
 *
 */

public class Solution19 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode result = new ListNode(0);
		ListNode listNode = result;

		int target = n;

		while (head.next != null) {

			if (isNthNodeNull(head, target)) {
				result.next = head.next;
				break;
			}

			result.next = head;
			result = result.next;
			head = head.next;
		}

		return listNode.next;
	}

	private boolean isNthNodeNull(ListNode listNode, int target) {
		ListNode node = listNode;

		for (int i = 0; i < target; i++) {

			if (node.next != null) {
				node = node.next;

			} else {
				return true;
			}
		}

		if (node == null) {
			return true;
		} else {
			return false;
		}

	}
}
