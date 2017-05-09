/**
 * @author Victor Young
 */
package me.sevenleaves.study.sortList;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class QuickSortTest extends TestCase {

	private QuickSort alg = new QuickSort();
	
	/**
	 * Test method for {@link me.sevenleaves.study.sortList.QuickSort#sort(me.sevenleaves.study.sortList.ListNode)}.
	 */
	public void testSort() {
		ListNode head = alg.createList ();
		
		alg.sort(head);
		boolean actual = alg.isSorted(head);
		
		assertEquals(true, actual);
	}

} // end of class.
