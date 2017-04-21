/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class InsertionSortTest extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.study.sort.InsertionSort#sort(java.lang.Comparable[])}.
	 */
	public void testSort() {
		Integer[] a = {3, 5, 7, 2, 9, 1, 6};
		InsertionSort ins = new InsertionSort();
		ins.sort(a);
		assertTrue(ins.isSorted(a));
		ins.show(a);
	}

} // end of the test case.
