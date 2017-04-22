/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

/**
 * @author Victor Young
 * @Todo: Select a minimum element, and exchange the position of head element.
 */
public class SelectionSort {

	public static  void sort (Comparable[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int min = i;
			for (int j = i+1; j < len; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			swap(a, i, min);
		}
		
	}
	
	private static boolean less (Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	/**
	 * Exchange the values of two parameters.
	 */
	private static void swap (Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/**
	 * Print the array in one line at console . 
	 */
	public static void show (Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * the array is sorted until each a[i] greater than a[i-1].  
	 */
	public static boolean isSorted (Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i-1]))
				return false;
		}
		return true;
	}
} // end of class
