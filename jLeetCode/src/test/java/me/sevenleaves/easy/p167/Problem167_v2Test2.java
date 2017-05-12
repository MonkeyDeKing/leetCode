/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p167;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 167. Two Sum II - Input array is sorted
 *		https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
 *		Medium.
 */
public class Problem167_v2Test2 extends TestCase {

	private Problem167_v2 p = new Problem167_v2();
	
	public void testTwoSum01() {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] rs = p.twoSum(nums, target);
		
		assertEquals(1, rs[0]);
		assertEquals(2, rs[1]);
	}
	
	public void testTwoSum02() {
		int[] nums = {2, 7, 11, 15};
		int target = 14;
		
		int[] rs = p.twoSum(nums, target);
		
		assertEquals(2, rs[0]);
		assertEquals(2, rs[1]);
	}
	
	public void testTwoSum03() {
		int[] nums = {2, 7};
		int target = 9;
		
		int[] rs = p.twoSum(nums, target);
		
		assertEquals(1, rs[0]);
		assertEquals(2, rs[1]);
	}
	
	public void testTwoSum04() {
		int[] nums = {2};
		int target = 4;
		
		int[] rs = p.twoSum(nums, target);
		
		assertEquals(1, rs[0]);
		assertEquals(1, rs[1]);
	}
	
	public void testTwoSum05() {
		int[] nums = {-1, 0};
		int target = -1;
		
		int[] rs = p.twoSum(nums, target);
		
		assertEquals(1, rs[0]);
		assertEquals(2, rs[1]);
	}
	
	
	public void testTwoSum06() {
		int[] nums = {5,25,75};
		int target = 100;
		
		int[] rs = p.twoSum(nums, target);
		
		assertEquals(2, rs[0]);
		assertEquals(3, rs[1]);
	}
	
	
	
} // end of class.
