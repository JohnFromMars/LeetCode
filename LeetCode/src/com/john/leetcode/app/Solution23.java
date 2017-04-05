package com.john.leetcode.app;

import java.util.Arrays;
import java.util.List;

/**
 * 23. Merge k Sorted Lists
 * 
 * @author wanyy257
 *
 */
public class Solution23 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
		}

		else if (lists.length == 1) {
			return lists[0];
		}

		else if (lists.length == 2) {
			return mergeTwoList(lists[0], lists[1]);
		}

		else {

			List<ListNode> temp = Arrays.asList(lists);
			ListNode[] leftHalf = (ListNode[]) temp.subList(0, temp.size() / 2)
					.toArray(new ListNode[(temp.size() / 2) - 0 + 1]);
			ListNode[] rightHalf = (ListNode[]) temp.subList(temp.size() / 2, temp.size())
					.toArray(new ListNode[temp.size() - (temp.size() / 2) + 1]);

			return mergeTwoList(mergeKLists(leftHalf), mergeKLists(rightHalf));
		}

	}

	private ListNode mergeTwoList(ListNode listNode, ListNode listNode2) {
		ListNode result = new ListNode(0);
		ListNode temp = result;

		while (listNode != null || listNode2 != null) {

			if (listNode == null) {
				temp.next = listNode2;

				if (listNode2.next == null) {
					listNode2 = null;
				} else {
					listNode2 = listNode2.next;
				}
			}

			if (listNode2 == null) {
				temp.next = listNode;

				if (listNode.next == null) {
					listNode = null;
				} else {
					listNode = listNode.next;
				}

			}

			if (listNode != null && listNode2 != null) {

				if (listNode.val < listNode2.val) {
					temp.next = listNode;
					listNode = listNode.next;

				} else {
					temp.next = listNode2;
					listNode2 = listNode2.next;
				}
			}
		}

		return result.next;
	}

}
