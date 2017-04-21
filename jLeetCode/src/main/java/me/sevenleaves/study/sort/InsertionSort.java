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

} // end of class
