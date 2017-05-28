/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p162;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem162Test extends TestCase {

	private Problem162 p = new Problem162();
	
	public final void testFindPeakElement01() {
		int[] nums = {1, 2, 3, 1};
		assertEquals(2, p.findPeakElement(nums));
	}

}
