/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p349;

import junit.framework.TestCase;
import me.sevenleaves.easy.p349.Problem349_v2;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem349_v2Test extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.easy.p349.Problem349_v2#intersection(int[], int[])}.
	 */
	public void testIntersection() {
		
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		
		int[] result = new Problem349_v2().intersection(nums1, nums2);
		
		int[] expected = {2};
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
	}

}
