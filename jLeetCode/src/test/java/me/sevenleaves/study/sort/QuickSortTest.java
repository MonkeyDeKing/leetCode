/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: Test the quick sort algorithm.
 *
 */
public class QuickSortTest extends TestCase {

	public void testSort () {
		Double[] a = SortCompare.randomInput(100);

		QuickSort alg = new QuickSort();
		alg.sort(a);

		assertTrue(alg.isSorted(a));
	}
	
} // end of class.
