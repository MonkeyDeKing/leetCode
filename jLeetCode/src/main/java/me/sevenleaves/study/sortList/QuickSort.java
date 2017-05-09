/**
 * @author Victor Young
 */
package me.sevenleaves.study.sortList;

/**
 * @author Victor Young
 * @Todo: quick sort.
 *
 */
public class QuickSort extends AbstractSort {

	/* (non-Javadoc)
	 * @see me.sevenleaves.study.sortList.AbstractSort#sort(me.sevenleaves.study.sortList.ListNode)
	 */
	@Override
	public void sort(ListNode head) {
		ListNode tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		
		quickSort (head, tail);
	}
	
	public void quickSort (ListNode beg, ListNode end) {
		if (beg == null || end == null) {
			return;
		}
		
		ListNode mid = paration(beg, end);
		
		quickSort (beg, mid);
		quickSort (mid.next, end);
	}
	
	/**
	 * 切分函数，以头节点的值为基准元素进行切分
	 */
	public ListNode paration (ListNode beg, ListNode end) {
		if (beg == null || end == null)
			return beg;
		
		int val = beg.val;
		ListNode index = beg, cur = beg.next;
		
		while (cur != end) {
			if (cur.val < val) {
				index = index.next;
				
				int tmp = cur.val;
				cur.val = index.val;
				index.val = tmp;
			}
			
			cur = cur.next;
		}
		
		beg.val = index.val;
		index.val = val;
		
		return index;
	}
	

} // end of class.
