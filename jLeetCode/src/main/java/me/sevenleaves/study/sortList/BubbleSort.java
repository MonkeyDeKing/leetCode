/**
 * @author Victor Young
 */
package me.sevenleaves.study.sortList;

/**
 * @author Victor Young
 * @Todo: bubble sort.
 *
 */
public class BubbleSort extends AbstractSort {

	/* (non-Javadoc)
	 * @see me.sevenleaves.study.sortList.AbstractSort#sort(me.sevenleaves.study.sortList.ListNode)
	 */
	@Override
	public void sort(ListNode head) {
		if (head == null || head.next == null) {
			return;
		}
		
		ListNode cur = head, tail = null;
		
		while (cur.next != tail) {
			while (cur.next != tail) {
				if (cur.val > cur.next.val) {
					int tmp = cur.val;
					cur.val = cur.next.val;
					cur.next.val = tmp;
				}
				
				cur = cur.next;
			}
			
			tail = cur;
			cur = head;
		}
		
	}

} // end of class.
