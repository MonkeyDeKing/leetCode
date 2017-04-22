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

	private static Random rand = new Random(System.currentTimeMillis());
	
	@SuppressWarnings("rawtypes")
	public static long time (SortAlg alg, Comparable[] a) {
		StopWatch timer = new StopWatch();
		timer.start();
		
		switch (alg) {
		case Insertion: new InsertionSort().sort(a); break;
		case Selection: SelectionSort.sort(a); break;
		case Shell: new ShellSort().sort(a); break;
		case MergeUD: new MergeSort().sortUpToDown(a); break;
		case MergeDU: new MergeSort().sortDownToUp(a); break;
		default:
			break;
		}
		
		timer.stop();
		return timer.getTime();
	}
	
	public enum SortAlg {
		Insertion, Selection, Shell, MergeUD, MergeDU, Quick, Heap
	}
	
	public static Double[] randomInput (int length) {
		Double[] a = new Double[length];
		for (int i = 0; i < length; i++) {
			a[i] = rand.nextDouble();
		}
		
		return a;
	}
	
	public static long timeRandomInput (SortAlg alg, int n, int t) {
		long total = 0L;
		Double[] a = new Double[n];
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
