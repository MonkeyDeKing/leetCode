/**
 * @author Victor Young
 */
package me.sevenleaves.study.sort;

import java.util.Random;

import org.apache.commons.lang3.time.StopWatch;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class SortCompare {

	@SuppressWarnings("rawtypes")
	public static long time (SortAlg alg, Comparable[] a) {
		StopWatch timer = new StopWatch();
		timer.start();
		
		switch (alg) {
		case Insertion: new InsertionSort().sort(a); break;
		case Selection: SelectionSort.sort(a); break;
		default:
			break;
		}
		
		timer.stop();
		return timer.getTime();
	}
	
	public enum SortAlg {
		Insertion, Selection, Shell, Merge, Quick, Heap
	}
	
	public static long timeRandomInput (SortAlg alg, int n, int t) {
		long total = 0L;
		Double[] a = new Double[n];
		Random rand = new Random(System.currentTimeMillis());
		// create t arrays that each length is n.
		for (int i = 0; i < t; i++) { 
			for (int j = 0; j < n; j++) {
				a[j] = rand.nextDouble();
			}
			
			total += time(alg, a);
		}
		
		return total;
	}
	
} // end of class.
