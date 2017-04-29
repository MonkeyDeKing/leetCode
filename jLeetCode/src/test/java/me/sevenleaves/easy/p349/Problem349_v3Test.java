/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p349;

import junit.framework.TestCase;
import me.sevenleaves.easy.p349.Problem349_v3;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem349_v3Test extends TestCase {

	/**
	 * Test method for {@link me.sevenleaves.easy.p349.Problem349_v3#intersection(int[], int[])}.
	 */
	public void testIntersection() {
		
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		
		int[] result = new Problem349_v3().intersection(nums1, nums2);
		
		int[] expected = {2};
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
	}
	public void testIntersection2() {
		
		int[] nums1 = {1};
		int[] nums2 = {1};
		
		int[] result = new Problem349_v3().intersection(nums1, nums2);
		
		int[] expected = {1};
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
	}

}
