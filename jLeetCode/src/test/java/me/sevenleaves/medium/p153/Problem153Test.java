/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p153;

import junit.framework.TestCase;

public class Problem153Test extends TestCase {

	private Problem153 p = new Problem153();
	
	public final void testFindMin01() {
		int[] nums = {4,5, 6, 7, 0, 1, 2};
		int actual = p.findMin(nums);
		
		assertEquals(0, actual);
	}
	
	public final void testFindMin02() {
		int[] nums = {4,5, 6, 7, 1, 2};
		int actual = p.findMin(nums);
		
		assertEquals(1, actual);
	}
	
	public final void testFindMin03() {
		int[] nums = {4,5, 6, 7, 9, 29};
		int actual = p.findMin(nums);
		
		assertEquals(4, actual);
	}
	
	public final void testFindMin04() {
		int[] nums = {4,5, 6, 7, 9, 2};
		int actual = p.findMin(nums);
		
		assertEquals(2, actual);
	}

}
