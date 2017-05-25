/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p454;

import junit.framework.TestCase;

public class Problem454Test extends TestCase {

	private Problem454 p = new Problem454();
	
	public final void testFourSumCount() {
		int[] a = {1, 2};
		int[] b = {-2,-1};
		int[] c = {-1, 2};
		int[] d = {0, 2};
		
		int expected = 2;
		int actual = p.fourSumCount(a, b, c, d);
		
		assertEquals(expected, actual);
	}

} // end of class.
