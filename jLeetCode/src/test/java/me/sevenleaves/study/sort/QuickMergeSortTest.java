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
public class QuickMergeSortTest extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.study.sort.QuickMergeSort#sort(java.lang.Comparable[])}.
	 */
	public void testSort() {
		Double[] a = SortCompare.randomInput(1000);

		QuickMergeSort alg = new QuickMergeSort();
		alg.sort(a);

		assertTrue(alg.isSorted(a));
	}

}
