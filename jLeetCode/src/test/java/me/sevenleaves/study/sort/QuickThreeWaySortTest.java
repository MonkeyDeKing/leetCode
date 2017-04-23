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
public class QuickThreeWaySortTest extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.study.sort.QuickThreeWaySort#sort(java.lang.Comparable[])}.
	 */
	public void testSort() {
		Double[] a = SortCompare.randomInput(100);

		QuickThreeWaySort alg = new QuickThreeWaySort();
		alg.sort(a);

		assertTrue(alg.isSorted(a));
	}

}
