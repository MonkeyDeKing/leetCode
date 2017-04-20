/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

/**
 * @author Victor Young
 * @Todo: the template of sort algorithms.
 *
 */
public class SortExample {

	public static void sort (Comparable[] a) {
		// TODO: implement sort algorithm.
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
		a[j] = a[i];
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
	
} // end of class.
