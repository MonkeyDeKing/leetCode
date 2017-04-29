/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p349;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Victor Young
 * @Todo: https://leetcode.com/problems/intersection-of-two-arrays/#/description
 *
 */
public class Problem349 {

	public int[] intersection(int[] nums1, int[] nums2) {

		Set<Integer> set1 = new HashSet<Integer>();
		for (int i : nums1) {
			set1.add(i);
		}
		
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i : nums2) {
			set2.add(i);
		}
		
		set1.retainAll(set2);
		int[] result = new int[set1.size()];
		int i = 0;
		for (int num : set1) {
			result[i++] = num;
		}
		
		return result;
	}
	
	
} // end of class.
