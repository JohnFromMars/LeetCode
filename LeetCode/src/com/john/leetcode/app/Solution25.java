package com.john.leetcode.app;

/**
 * 25. Reverse Nodes in k-Group. Given a linked list, reverse the nodes of a
 * linked list k at a time and return its modified list.
 * 
 * k is a positive integer and is less than or equal to the length of the linked
 * list. If the number of nodes is not a multiple of k then left-out nodes in
 * the end should remain as it is.
 * 
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * 
 * Only constant memory is allowed.
 * 
 * For example, Given this linked list: 1->2->3->4->5
 * 
 * For k = 2, you should return: 2->1->4->3->5
 * 
 * For k = 3, you should return: 3->2->1->4->5
 * 
 * @author wanyy257
 *
 */
public class Solution25 {

	public ListNode reverseKGroup(ListNode head, int k) {

		if (head == null || head.next == null || k < 2) {
			return head;
		}

		int count = 0;
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		ListNode prev = dummy;
		ListNode temp;

		dummy.next = head;

		while (true) {
			count = k;
			// find the end in k group
			while (count > 0 && tail != null) {
				count--;
				tail = tail.next;
			}

			// has reach the end
			if (tail == null) {
				break;
			}

			head = prev.next;
			// prev-->temp-->...--->....--->tail-->....
			// Delete @temp and insert to the next position of @tail
			// prev-->...-->...-->tail-->head-->...
			// Assign @temp to the next node of @prev
			// prev-->temp-->...-->tail-->...-->...
			// Keep doing until @tail is the next node of @prev

			while (prev.next != tail) {
				temp = prev.next;
				prev.next = temp.next;
				temp.next = tail.next;
				tail.next = temp;
			}

		}

		return dummy.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
