/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p349;

/**
 * @author Victor Young
 * @Todo:
 * Tag : Sort.
 */
public class Problem349_v4 {
	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1.length == 0 || nums2.length == 0)
			return new int[0];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums1.length; i++) {
			max = (int) Math.max(max, nums1[i]);
			min = (int) Math.min(min, nums1[i]);
		}
		int[] arr = new int[max - min + 1];
		for (int i = 0; i < nums1.length; i++)
			arr[nums1[i] - min]++;
		int count = 0;
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] < min || nums2[i] > max)
				continue;
			if (arr[nums2[i] - min] > 0) {
				arr[nums2[i] - min] = -arr[nums2[i] - min];
				count++;
			}
		}
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				result[index++] = i + min;
		}
		return result;
	}

} // end of class.
