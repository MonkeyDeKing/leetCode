/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p147;

import me.sevenleaves.study.sortList.ListNode;

/**
 * @author Victor Young
 * @Todo: 147. Insertion Sort List
 * https://leetcode.com/problems/insertion-sort-list/#/description
 * Medium
 */
public class Problem147 {

	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode pre = new ListNode(-1);
		
		ListNode cur = head, next = null;
		while (cur != null) {
			ListNode idx = pre;
			
			while (idx.next != null && idx.next.val < cur.val) {
				idx = idx.next;
			}
			next = cur.next;
			
			cur.next = idx.next;
			idx.next = cur;
			
			cur = next;
		}
		
		return pre.next;
	}
	
} // end of class.
