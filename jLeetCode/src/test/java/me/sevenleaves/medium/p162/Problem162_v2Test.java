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
public class Problem162_v2Test extends TestCase {

	private Problem162_v2 p = new Problem162_v2();
	
	public final void testFindPeakElement01() {
		int[] nums = {1, 2, 3, 1};
		assertEquals(2, p.findPeakElement(nums));
	}
	
	public final void testFindPeakElement02() {
		int[] nums = {4,3,3,1};
		assertEquals(0, p.findPeakElement(nums));
	}
	
	public final void testFindPeakElement03() {
		int[] nums = {2,3,1,4,2,1};
		
		boolean flag = false;
		int rs = p.findPeakElement(nums);
		if (rs == 1 || rs == 3)
			flag = true;
		assertEquals(true, flag);
	}

}
