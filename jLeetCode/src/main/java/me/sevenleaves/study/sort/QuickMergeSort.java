/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

import java.util.Random;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class QuickMergeSort extends AbstractSort {

	private Random rand = new Random(System.currentTimeMillis());
	
	private final int MERGE_SIZE = 10;
	private InsertionSort ins = new InsertionSort();
	
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
	@SuppressWarnings("rawtypes")
	private void sort (Comparable[] a, int beg, int end) {
		if (end - beg >= MERGE_SIZE) {
			ins.sort(a, beg, end);
			return;
		}
		
		int mid = partition (a, beg, end);
		
		sort (a, beg, mid-1);
		sort (a, mid+1, end);
	}
	
	/**
	 * 切分数组。
	 * @return 索引mid。
	 * 对于某个索引mid，a[mid]已经排定；
	 * a[bge]到a[mid-1]中的所有元素都不大于a[mid]
	 * a[mid+1]到a[end]中的所有元素都不小于a[mid]
	 */
	@SuppressWarnings("rawtypes")
	private int partition (Comparable[] a, int beg, int end) {
		int right = beg, left = end + 1;
		
		Comparable gard = a[beg];
		while (true) {
			while (less(a[++right], gard)) {
				if (right == end) {
					break;
				}
			}
			
			while (less(gard, a[--left])) {
				if (left == beg) {
					break;
				}
			}
			
			if (right >= left) {
				break;
			}
			
			swap(a, right, left);
		}
		
		swap (a, beg, left); // put the gardener into the right position.
		
		return left;
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
