/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Victor Young
 * @Todo: 
 * 
 */
public class Problem349_v3 {

	/**
	 * 先对短数组进行排序，然后用二分查找。
	 */
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		
		int[] lon, sho;
		if (nums1.length > nums2.length) {
			lon = nums1;
			sho = nums2;
		} else {
			lon = nums2;
			sho = nums1;
		}
		
		Arrays.sort(sho);
		
		for (int i : lon) {
			if (binarySearch(sho, i)) {
				set.add(i);
			}
		}
		
		int i = 0;
		int[] rs = new int[set.size()];
		for (int n : set) {
			rs[i++] = n;
		}
		
		return rs;
	}
	
	public static boolean binarySearch (int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		
		int lo = 0, hi = nums.length, mid;
		while (lo < hi) {
			mid = (lo + hi) / 2;
			if (nums[mid] == target) {
				return true;
			} else if (target < nums[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		
		return false;
	}
	
} // end of class.
