/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

import java.util.Random;

/**
 * @author Victor Young
 * @Todo: 三向切分的快排。
 */
public class QuickThreeWaySort extends AbstractSort {

	private Random rand = new Random(System.currentTimeMillis());
	
	/* 
	 * @see me.sevenleaves.study.sort.AbstractSort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		// 随机排序，消除对输入的依赖
		shuffle(a);
		
		sort (a, 0, a.length-1);
	}
	
	// 从beg开始，到end为止，包括end在内，进行排序。
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void sort (Comparable[] a, int beg, int end) {
		if (beg >= end) {
			return;
		}
		
		int lessThan = beg;
		int greaterThan = end;
		int idx = beg + 1;
		
		Comparable v = a[beg];
		while (idx <= greaterThan) {
			int cmp = a[idx].compareTo(v);
			if (cmp < 0) {
				swap (a, lessThan++, idx++);
			} else if (cmp > 0) {
				swap (a, idx, greaterThan--);
			} else {
				idx++;
			}
		}
		
		sort (a, beg, lessThan-1);
		sort (a, greaterThan+1, end);
	}
	
	/**
	 * 随机将数组中的元素排序
	 */
	@SuppressWarnings("rawtypes")
	private void shuffle (Comparable[] a) {
		int len = a.length;
		
		int r;
		Comparable t;
		for (int i = 0; i < len; i++) {
			r = rand.nextInt(len);
			
			t = a[i];
			a[i] = a[r];
			a[r] = t;
		}
	}
	
} // end of class.
