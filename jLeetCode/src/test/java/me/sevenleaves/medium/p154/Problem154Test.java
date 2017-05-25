/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p154;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem154Test extends TestCase {

	private Problem154 p = new Problem154();
	
	public final void testFindMin01() {
		int[] nums = {4,4,5, 6, 7, 0, 1, 2};
		int actual = p.findMin(nums);
		
		assertEquals(0, actual);
	}
	
	public final void testFindMin02() {
		int[] nums = {4,5, 6, 7, 7, 1, 2};
		int actual = p.findMin(nums);
		
		assertEquals(1, actual);
	}
	
	public final void testFindMin03() {
		int[] nums = {4, 4,5, 6, 7, 9, 29};
		int actual = p.findMin(nums);
		
		assertEquals(4, actual);
	}
	
	public final void testFindMin04() {
		int[] nums = {3,3,1,3};
		int actual = p.findMin(nums);
		
		assertEquals(1, actual);
	}
	
	public final void testFindMin05() {
		int[] nums = {4,2,4,4,4};
		int actual = p.findMin(nums);
		
		assertEquals(2, actual);
	}
}
