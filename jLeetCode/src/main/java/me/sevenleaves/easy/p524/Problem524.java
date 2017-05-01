/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p524;

import java.util.List;

/**
 * @author Victor Young
 * @Todo: Sort. Medium.
 *        https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/#/description
 */
public class Problem524 {

	public String findLongestWord(String s, List<String> d) {
		char[] chars = s.toCharArray();
		
		String rs = "", t;
		for (int i = 0; i < d.size(); i++) {
			t = d.get(i);
			
			if (has(chars, t)) {
				if (rs.length() == 0) {
					rs = t;
				} else {
					if (rs.length() == t.length()) {
						if (rs.compareTo(t) > 0) {
							rs = d.get(i);
						}
					} else if (rs.length() < t.length()) {
						rs = t;
					}
				}
			}
		}
		
		return rs;
	}
	
	public boolean has (char[] chars, String w) {
		if (w.length() > chars.length)
			return false;
		
		char[] word = w.toCharArray();
		int i = 0, j = 0, acc = 0;
		while (i < chars.length && j < word.length) {
			if (chars[i] == word[j]) {
				i++;
				j++;
				acc++;
			} else {
				i++;
			}
		}
		
		if (acc < word.length) {
			return false;
		} else {
			return true;
		}
	}
	

} // end of class.
