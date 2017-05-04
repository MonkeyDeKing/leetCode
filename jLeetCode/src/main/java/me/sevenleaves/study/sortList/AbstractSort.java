/**
 * @author Victor Young
 */
package me.sevenleaves.study.sortList;

/**
 * @author Victor Young
 * @Todo: The root class of all simple sort algorithms on lists.
 */
public abstract class AbstractSort {

	public abstract void sort (ListNode head);
	
	public boolean less (ListNode n1, ListNode n2) {
		return n1.val < n2.val;
	}
	
	
	
	
	/**
	 * Print the array in one line at console . 
	 */
	public void show (ListNode head) {
		if (head == null)
			return;
		
		ListNode t = head;
		while (t.next != null) {
			System.out.print(t.val + " ");
			t = t.next;
		}
		System.out.print(t.val + " ");
		System.out.println();
	}
	
	/**
	 * the array is sorted until each a[i] greater than a[i-1].  
	 */
	public boolean isSorted (ListNode head) {
		if (head == null || head.next == null) 
			return true;
		
		ListNode t = head;
		while (t.next != null) {
			if (t.val > t.next.val) 
				return false;
			
			t = t.next;
		}
		
		return true;
	}
	
} // end of class.
