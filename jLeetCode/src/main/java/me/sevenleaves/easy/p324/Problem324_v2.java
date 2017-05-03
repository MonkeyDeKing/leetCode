/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p324;

/**
 * @author Victor Young
 * @Todo: 324. Wiggle Sort II
 *        https://leetcode.com/problems/wiggle-sort-ii/#/description Medium
 *        29.81%
 */
public class Problem324_v2 {

	/**
	 * 1. Split the array by medians, into smalls, medians, larges. 
	 * 2. Get the output 
	 * 	2.1 Use the smalls to fill even spots from right to left. 
	 * 	2.2 Use the larges to fill odd spots from left to right. 
	 * 	2.3 Leave the medians at two ends.
	 */
	public void wiggleSort(int[] nums) {

		int median = findKthLargest (nums, (nums.length + 1)/2);
		int n = nums.length;
		
		int le = 0, i = 0, ri = n - 1;
		
		while (i <= ri) {
			int mappedIdx = mapping (i, n);
			int current = nums[mappedIdx];
			if (current > median) {
				swap (nums, mapping(le, n), mappedIdx);
				le++;
				i++;
			} else if (current < median) {
				swap (nums, mapping(ri, n), mappedIdx);
				ri--;
			} else {
				i++;
			}
		}
		
	}
	
	private int findKthLargest (int[] a, int k) {
		int n = a.length;
		int p = quickSelect (a, 0, n-1, n - k + 1);
		
		return a[p];
	}
	
	private int quickSelect (int[] a, int lo, int hi, int k) {
		int i = lo, j = hi, pivot = a[hi];
		while (i < j) {
			if (a[i++] > pivot) {
				swap(a, --i, --j);
			}
		}
		swap(a, i, hi);
		
		int m = i - lo + 1;
		if (m == k)
			return i;
		else if (m > k)
			return quickSelect (a, lo, i - 1, k);
		else
			return quickSelect (a, i+1, hi, k - m);
	}

	private int mapping(int index, int n) {
		// example for this mapping
		// n = 6, n|1 = 7
		// Original idx: 0 1 2 3 4 5
		// Mapped idx: 1 3 5 0 2 4
		return (1 + 2 * index) % (n | 1);
	}
	
	private void swap (int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

} // end of class.
