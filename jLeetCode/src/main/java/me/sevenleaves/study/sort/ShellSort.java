/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

/**
 * @author Victor Young
 * @Todo: Shell sort.
 * 希尔排序的思想：使数组中任意间隔为h的元素都是有序的，即h有序数组。
 * 一个h有序数组就是h个互相独立的有序子数组编织在一起组成的一个数组。
 * 
 * 是基于插入排序进行改进后的低于O(n*n)的算法。
 */
public class ShellSort extends AbstractSort {

	/* (non-Javadoc)
	 * @see me.sevenleaves.study.sort.AbstractSort#sort(java.lang.Comparable[])
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N/3) {
			h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
		}
		
		while (h >= 1) {
			// 将数组变为h有序
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
					swap(a, j, j-h);
				}
			}
			
			h = h / 3; // 除法取整后，正好是递归的上一个数。
		}
	}
	

} // end of class.
