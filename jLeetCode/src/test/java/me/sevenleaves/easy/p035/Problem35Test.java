/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p035;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem35Test extends TestCase {

	private Problem35 p = new Problem35();
	
	public final void testSearchInsert01() {
		int[] nums = {1,3,5,6};
		int target = 5;
		
		assertEquals(2, p.searchInsert(nums, target));
	}
	
	public final void testSearchInsert02() {
		int[] nums = {1,3,5,6};
		int target = 2;
		
		assertEquals(1, p.searchInsert(nums, target));
	}
	
	public final void testSearchInsert03() {
		int[] nums = {1,3,5,6};
		int target = 7;
		
		assertEquals(4, p.searchInsert(nums, target));
	}
	
	public final void testSearchInsert04() {
		int[] nums = {1,3,5,6};
		int target = 0;
		
		assertEquals(0, p.searchInsert(nums, target));
	}

}
