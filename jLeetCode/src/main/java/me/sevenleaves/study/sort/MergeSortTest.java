/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

import junit.framework.TestCase;
import me.sevenleaves.study.sort.SortCompare.SortAlg;

/**
 * @author Victor Young
 * @Todo:
 *
 */
public class MergeSortTest extends TestCase {

	public void testSortUpToDown() {
		Double[] a = SortCompare.randomInput(100);

		MergeSort alg = new MergeSort();
		alg.sortUpToDown(a);

		assertTrue(alg.isSorted(a));
	}

	public void testSortDownToUp() {
		Double[] a = SortCompare.randomInput(100);

		MergeSort alg = new MergeSort();
		alg.sortDownToUp(a);

		assertTrue(alg.isSorted(a));
	}
	
	public void testCompare() {
		int n = 10000, t = 10;
		
		long time = SortCompare.timeRandomInput(SortAlg.MergeUD, n, t);
		System.out.println("up to down merge -> " + time);
		
		time = SortCompare.timeRandomInput(SortAlg.MergeDU, n, t);
		System.out.println("up to down merge -> " + time);
	}

} // end of class.
