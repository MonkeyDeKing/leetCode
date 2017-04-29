/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Victor Young
 * @Todo: https://leetcode.com/problems/intersection-of-two-arrays/#/description
 * Tag : Sort.
 */
public class Problem349_v2 {

	/**
	 * 先对两个数组进行排序，再遍历两个数组找到共同元素。
	 */
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i = 0, j = 0;
		final int LEN1 = nums1.length;
		final int LEN2 = nums2.length;
		while (i < LEN1 && j < LEN2) {
			if (nums1[i] == nums2[j]) {
				set.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
			
		}
		
		i = 0;
		int[] rs = new int[set.size()];
		for (int n : set) {
			rs[i++] = n;
		}
		
		return rs;
	}
	
} // end of class.
