/**
 * @author Victor Young
 */
package me.sevenleaves.study.search;

/**
 * @author Victor Young
 * @Todo: binary search.
 *
 */
public class BinarySearch {

	/**
	 * 如果不存在改元素则返回-1。
	 */
	public static int search (int key, int[] a) {
		assert isSorted(a);
		
		int idx = -1;
		int i = 0, j = a.length-1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (key == a[mid]) {
				idx = mid;
				break;
			} else if (key < a[mid]) {
				j = mid - 1;
			} else {
				i = mid + 1;
			}
		}
		
		return idx;
	}
	
	private static boolean isSorted (int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}
	
} // end of class.
