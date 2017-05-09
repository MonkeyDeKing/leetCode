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
public class MergeSortTest extends TestCase {

	MergeSort alg = new MergeSort();
	
	/**
	 * Test method for {@link me.sevenleaves.study.sortList.MergeSort#sort(me.sevenleaves.study.sortList.ListNode)}.
	 */
	public void testSort() {
		ListNode head = alg.createList ();
		
		alg.sort(head);
		boolean actual = alg.isSorted(head);
		
		assertEquals(true, actual);
	}

} // end of class.
