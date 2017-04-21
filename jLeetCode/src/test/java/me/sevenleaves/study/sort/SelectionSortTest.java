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
public class SelectionSortTest extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.study.sort.SelectionSort#sort(java.lang.Comparable[])}.
	 */
	public void testSort() {
		Integer[] a = {3, 5, 7, 2, 9, 1, 6};
		SelectionSort.sort(a);
		assertTrue(SelectionSort.isSorted(a));
		SelectionSort.show(a);
	}

}
