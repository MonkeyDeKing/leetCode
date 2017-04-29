/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p350;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem350Test extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.easy.p350.Problem350#intersection(int[], int[])}.
	 */
	public void testIntersection() {
		
		int[] nums1 = {3, 1, 2};
		int[] nums2 = {1, 3};
		
		int[] result = new Problem350().intersection(nums1, nums2);
		
		int[] expected = {1, 3};
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
	}

}
