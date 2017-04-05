package com.john.leetcode.app;

/**
 * 24. Swap Nodes in Pairs. Given a linked list, swap every two adjacent nodes
 * and return its head.
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * @author wanyy257
 *
 */
public class Solution24 {

	public ListNode swapPairs(ListNode head) {

		ListNode node = new ListNode(0);
		node.next = head;
		ListNode current = node;

		while (current.next != null && current.next.next != null) {
			ListNode first = current.next;
			ListNode second = current.next.next;
			first.next = second.next;
			current.next = second;
			current.next.next = first;

			current = current.next.next;
		}

		return node.next;

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
