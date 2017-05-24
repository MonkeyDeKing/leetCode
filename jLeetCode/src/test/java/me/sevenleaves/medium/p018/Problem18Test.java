/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p018;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem18Test extends TestCase {

	private Problem18 p = new Problem18();
	
	public final void testFourSum01() {
		int[] nums = {1, 0, -1, 0, -2, 2};
		int target = 0;
		
		List<List<Integer>> actual = p.fourSum(nums, target);
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		
		List<Integer> e1 = new ArrayList<Integer>();
		e1.add(-1);
		e1.add(0);
		e1.add(0);
		e1.add(1);
		
		List<Integer> e2 = new ArrayList<Integer>();
		e2.add(-2);
		e2.add(-1);
		e2.add(1);
		e2.add(2);
		
		List<Integer> e3 = new ArrayList<Integer>();
		e3.add(-2);
		e3.add(0);
		e3.add(0);
		e3.add(2);
		
		expected.add(e3);
		expected.add(e1);
		expected.add(e2);
		
		assertEquals(expected.size(), actual.size());
		for (List<Integer> list : expected) {
			assertEquals(true, actual.contains(list));
		}
	}
	
	public final void testFourSum02() {
		int[] nums = {-3,-2,-1,0,0,1,2,3};
		int target = 0;
		
		List<List<Integer>> actual = p.fourSum(nums, target);
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		
		List<Integer> e1 = new ArrayList<Integer>();
		int[] nums1 = {-3,-2,2,3};
		for (int num : nums1) {
			e1.add(num);
		}
		List<Integer> e2 = new ArrayList<Integer>();
		int[] nums2 = {-3,-1,1,3};
		for (int num : nums2) {
			e2.add(num);
		}
		List<Integer> e3 = new ArrayList<Integer>();
		int[] nums3 = {-3,0,0,3};
		for (int num : nums3) {
			e3.add(num);
		}
		List<Integer> e4 = new ArrayList<Integer>();
		int[] nums4 = {-3,0,1,2};
		for (int num : nums4) {
			e4.add(num);
		}
		List<Integer> e5 = new ArrayList<Integer>();
		int[] nums5 = {-2,-1,0,3};
		for (int num : nums5) {
			e5.add(num);
		}
		List<Integer> e6 = new ArrayList<Integer>();
		int[] nums6 = {-2,-1,1,2};
		for (int num : nums6) {
			e6.add(num);
		}
		List<Integer> e7 = new ArrayList<Integer>();
		int[] nums7 = {-2,0,0,2};
		for (int num : nums7) {
			e7.add(num);
		}
		List<Integer> e8 = new ArrayList<Integer>();
		int[] nums8 = {-1,0,0,1};
		for (int num : nums8) {
			e8.add(num);
		}
		
		expected.add(e1);
		expected.add(e2);
		expected.add(e3);
		expected.add(e4);
		expected.add(e5);
		expected.add(e6);
		expected.add(e7);
		expected.add(e8);
		
		assertEquals(expected.size(), actual.size());
		for (List<Integer> list : expected) {
			assertEquals(true, actual.contains(list));
		}
	}

}
