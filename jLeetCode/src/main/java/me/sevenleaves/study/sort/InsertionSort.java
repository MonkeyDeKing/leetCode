/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class InsertionSort extends AbstractSort {

	/* 
	 * @see me.sevenleaves.study.sort.AbstractSort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		Comparable temp;
		for (int i = 1; i < a.length; i++) {
			temp = a[i];
			
			int idx = i;
			for (int j = 0; j < i; j++) {
				if (less(temp, a[j])) {
					idx = j;
					break;
				}
			}
			
			for (int k = i; k > idx; k--) {
				a[k] = a[k-1]; 
			}
			a[idx] = temp;
		}

	}
	
	@SuppressWarnings("rawtypes")
	public void sort (Comparable[] a, int beg, int end) {
		Comparable temp;
		for (int i = beg+1; i <= end; i++) {
			temp = a[i];
			
			int idx = i;
			for (int j = 0; j < i; j++) {
				if (less(temp, a[j])) {
					idx = j;
					break;
				}
			}
			
			for (int k = i; k > idx; k--) {
				a[k] = a[k-1]; 
			}
			a[idx] = temp;
		}

	}
	
	@SuppressWarnings("rawtypes")
	public void sortDemo (Comparable[] a) {
		int len = a.length;
		for (int i = 1; i < len; i++) {
			// insert a[i] into the sequence a[i-1], a[i-2],...
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
				swap(a, j, j-1);
			}
		}
	}

} // end of class
