/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p148;

/**
 * @author Victor Young
 * @Todo: 148. Sort List
 * https://leetcode.com/problems/sort-list/#/description
 * Medium
 */
public class Problem148 {

	public ListNode sortList(ListNode head) {
		ListNode idx = head;
		
		if (idx.next == null) {
			return head;
		} else {
			idx = idx.next;
			head.next = null;
		}
		
		do {
			
		} while (idx.next != null);
		
		return null;
	}
	
	
} // end of class.
