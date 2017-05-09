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
		
		return mergeSort(head);
	}
	
	private ListNode mergeSort (ListNode head) {
		if (head == null || head.next ==null)
			return head;
		
		// use fast-slow pointer to find the medium node
		ListNode slow = head, fast = head.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			
			fast = fast.next;
			if (fast.next != null) {
				fast = fast.next;
			} else {
				break;
			}
		}
		
		ListNode mid = slow.next;
		slow.next = null;
		
		ListNode tmp1 = mergeSort(head);
		ListNode tmp2 = mergeSort(mid);
		
		return merge(tmp1, tmp2);
	}
	
	private ListNode merge (ListNode h1, ListNode h2) {
		ListNode head = new ListNode(-1);
		ListNode pre = head;
		
		ListNode ptr1 = h1, ptr2 = h2;
		while (ptr1 != null && ptr2 != null) {
			if (ptr1.val <= ptr2.val) {
				pre.next = ptr1;
				pre = ptr1;
				ptr1 = ptr1.next;
			} else {
				pre.next = ptr2;
				pre = ptr2;
				ptr2 = ptr2.next;
			}
		}
		
		while (ptr1 != null) {
			pre.next = ptr1;
			pre = ptr1;
			ptr1 = ptr1.next;
		}
		
		while (ptr2 != null) {
			pre.next = ptr2;
			pre = ptr2;
			ptr2 = ptr2.next;
		}
		
		return head.next;
	}
	
	
} // end of class.
