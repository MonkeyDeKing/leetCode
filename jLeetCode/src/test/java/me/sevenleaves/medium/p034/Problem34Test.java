/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p034;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem34Test extends TestCase {

	private Problem34 p = new Problem34();
	
	public final void testSearchRange01() {
		int[] nums = {1,3,5,5,7};
		int[] rs = p.searchRange(nums, 5);
		assertEquals(2, rs[0]);
		assertEquals(3, rs[1]);
	}
	
	public final void testSearchRange02() {
		int[] nums = {5,5,5,5,5,5,5,5,5,7};
		int[] rs = p.searchRange(nums, 5);
		assertEquals(0, rs[0]);
		assertEquals(8, rs[1]);
	}
	
	public final void testSearchRange03() {
		int[] nums = {5};
		int[] rs = p.searchRange(nums, 5);
		assertEquals(0, rs[0]);
		assertEquals(0, rs[1]);
	}
	
	public final void testSearchRange04() {
		int[] nums = {1};
		int[] rs = p.searchRange(nums, 0);
		assertEquals(-1, rs[0]);
		assertEquals(-1, rs[1]);
	}
	
	public final void testSearchRange05() {
		int[] nums = {0,1,2,3};
		int[] rs = p.searchRange(nums, 0);
		assertEquals(0, rs[0]);
		assertEquals(0, rs[1]);
	}
	
	public final void testSearchRange06() {
		int[] nums = {2,2};
		int[] rs = p.searchRange(nums, 3);
		assertEquals(-1, rs[0]);
		assertEquals(-1, rs[1]);
	}
	
	public final void testSearchRange07() {
		int[] nums = {1,5};
		int[] rs = p.searchRange(nums, 4);
		assertEquals(-1, rs[0]);
		assertEquals(-1, rs[1]);
	}

}
