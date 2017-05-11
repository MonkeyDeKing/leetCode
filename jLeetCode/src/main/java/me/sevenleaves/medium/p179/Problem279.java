/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p179;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Victor Young
 * @Todo: 179. Largest Number
 * https://leetcode.com/problems/largest-number/#/description 
 * Medium.
 */
public class Problem279 {

	public String largestNumber(int[] nums) {
		int len = nums.length;
		
		List<Integer> list = new ArrayList<Integer>(len);
		for (int num : nums) {
			list.add(num);
		}
		
		Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer a, Integer b) {
				String ab = a + "" + b;
				String ba = b + "" + a;
				
				return ab.compareTo(ba);
			}
			
		});
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = len-1; i >= 0; i--) {
			sb.append(list.get(i));
		}
		
		String rs = sb.toString();
		
		if (rs.startsWith("0"))
			return "0";
		
		return rs;
	}

} // end of class.
