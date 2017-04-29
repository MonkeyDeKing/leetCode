/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p349;

import junit.framework.TestCase;
import me.sevenleaves.easy.p349.Problem349;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem349Test extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.easy.p349.Problem349#intersection(int[], int[])}.
	 */
	public void testIntersection() {
		
		int[] nums1 = {3, 1, 2};
		int[] nums2 = {1, 3};
		
		int[] result = new Problem349().intersection(nums1, nums2);
		
		int[] expected = {2};
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
	}

} // end of class.
