/**
 * @author Victor Young
 */
package me.sevenleaves.study.search;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class BinarySearchTest extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.study.search.BinarySearch#search(int, int[])}.
	 */
	public void testSearch() {
		final int N = 100;
		
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = i;
		}
		
		int idx = BinarySearch.search(9, a);
		assertEquals(9, idx);
		idx = BinarySearch.search(19, a);
		assertEquals(19, idx);
		idx = BinarySearch.search(29, a);
		assertEquals(29, idx);
		idx = BinarySearch.search(39, a);
		assertEquals(39, idx);
		idx = BinarySearch.search(49, a);
		assertEquals(49, idx);
		
	}

} // end of class.
