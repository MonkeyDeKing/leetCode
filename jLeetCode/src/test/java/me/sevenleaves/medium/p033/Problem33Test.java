/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p033;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem33Test extends TestCase {
	
	private Problem33 p = new Problem33();
	
	public final void testSearch01() {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		
		assertEquals(0, p.search(nums, 4));
	}
	
	public final void testSearch02() {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		
		assertEquals(4, p.search(nums, 0));
	}
	
	public final void testSearch03() {
		int[] nums = {4, 5, 6, 7, 0, 1, 2};
		
		assertEquals(6, p.search(nums, 2));
	}
	
	public final void testSearch04() {
		int[] nums = {5, 1, 3};
		
		assertEquals(0, p.search(nums, 5));
	}
	
	public final void testSearch05() {
		int[] nums = {6,7,1,2,3,4,5};
		
		assertEquals(0, p.search(nums, 6));
	}
	
	public final void testSearch06() {
		int[] nums = {1};
		
		assertEquals(0, p.search(nums, 1));
	}

}
