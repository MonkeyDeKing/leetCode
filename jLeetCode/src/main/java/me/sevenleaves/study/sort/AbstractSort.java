/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

/**
 * @author Victor Young
 * @Todo: The root class of all simple sort algorithms.
 */
public abstract class AbstractSort {

	@SuppressWarnings("rawtypes")
	public abstract void sort (Comparable[] a);
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean less (Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	/**
	 * Exchange the values of two indexes in array.
	 */
	@SuppressWarnings({ "rawtypes" })
	public void swap (Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/**
	 * Print the array in one line at console . 
	 */
	@SuppressWarnings("rawtypes")
	public void show (Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * the array is sorted until each a[i] greater than a[i-1].  
	 */
	@SuppressWarnings("rawtypes")
	public boolean isSorted (Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i-1]))
				return false;
		}
		return true;
	}
	
} // end of class.
