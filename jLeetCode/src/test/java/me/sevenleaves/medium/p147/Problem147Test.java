/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p147;

import junit.framework.TestCase;
import me.sevenleaves.medium.p147.Problem147;
import me.sevenleaves.study.sortList.BubbleSort;
import me.sevenleaves.study.sortList.ListNode;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem147Test extends TestCase {

	private Problem147 p = new Problem147();
	private BubbleSort alg = new BubbleSort();
	
	public void testInsertionSortList() {
		ListNode head = alg.createList ();
		
		alg.show(head);
		head = p.insertionSortList(head);
		alg.show(head);
		
		boolean actual = alg.isSorted(head);
		
		assertEquals(true, actual);
	}

} // end of class.
