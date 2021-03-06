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
	
	public void testSortDemo () {
		Integer[] a = {3, 5, 7, 2, 9, 1, 6};
		InsertionSort ins = new InsertionSort();
		ins.sortDemo(a);
		assertTrue(ins.isSorted(a));
		ins.show(a);
	}
	
	public void testParamsSort () {
		Double[] a = SortCompare.randomInput(1000);

		InsertionSort alg = new InsertionSort();
		alg.sort(a, 0, a.length);

		assertTrue(alg.isSorted(a));
	}

} // end of the test case.
