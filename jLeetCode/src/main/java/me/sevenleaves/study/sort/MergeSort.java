/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class MergeSort extends AbstractSort {

	@SuppressWarnings("rawtypes")
	private static Comparable[] aux;
	
	/* (non-Javadoc)
	 * @see me.sevenleaves.study.sort.AbstractSort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sortUpToDown(a, 0, a.length-1);
	}
	
	@SuppressWarnings("rawtypes")
	public void sortUpToDown (Comparable[] a) {
		aux = new Comparable[a.length];
		sortUpToDown(a, 0, a.length-1);
	}
	
	/**
	 * 自顶向下的归并排序
	 */
	@SuppressWarnings("rawtypes")
	private void sortUpToDown(Comparable[] a, int beg, int end) {
		if (beg >= end) {
			return;
		}
		
		int mid = (end - beg) / 2 + beg;
		
		sortUpToDown(a, beg, mid);
		sortUpToDown(a, mid+1, end);
		
		merge(a, beg, mid, end);
	}
	
	@SuppressWarnings("rawtypes")
	public void sortDownToUp (Comparable[] a) {
		int len = a.length;
		aux = new Comparable[len];
		
		// 对size规模的子数组排序
		for (int size = 1; size < len; size *= 2) {
			for (int beg = 0; beg < len-size; beg += size * 2) {
				int end = (beg + size*2 < len) ? (beg + size*2 - 1) : (len - 1);
				merge(a, beg, beg + size - 1, end);
			}
		}
	}
	
	

	/**
	 * 归并数组a[beg, mid]和a[mid+1, end]
	 */
	@SuppressWarnings("rawtypes")
	public void merge (Comparable[] a, int beg, int mid, int end) {
		int i = beg;
		int j = mid + 1;
		
		for (int k = beg; k <= end; k++) {
			aux[k] = a[k];
		}
		
		for (int k = beg; k <= end; k++) {
			if (i > mid) {
				a[k] = aux[j++];
			} else if (j > end) {
				a[k] = aux[i++];
			} else if (less(aux[j], aux[i])) {
				a[k] = aux[j++];
			} else {
				a[k] = aux[i++];
			}
		}
	}

} // end of class.
