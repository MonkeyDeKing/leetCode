/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p300;

import junit.framework.TestCase;

public class Problem300Test extends TestCase {

	private Problem300 p = new Problem300();
	
	public final void testLengthOfLIS() {
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		
		assertEquals(4, p.lengthOfLIS(nums));
	}

} // end of class.
