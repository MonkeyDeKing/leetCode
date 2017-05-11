/**
 * @author Victor Young
 */
package me.sevenleaves.medium.p524;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import me.sevenleaves.medium.p524.Problem524;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Problem524Test extends TestCase {

	Problem524 p = new Problem524();
	
	public void testFindLongestWord01() {
		String s = "abpcplea";
		List<String> d = new ArrayList<String>();
		d.add("ale");
		d.add("apple");
		d.add("monkey");
		d.add("plea");
		
		String actual = p.findLongestWord(s, d);
		
		assertEquals("apple", actual);
	}
	public void testFindLongestWord02() {
		String s = "abpcplea";
		List<String> d = new ArrayList<String>();
		d.add("a");
		d.add("b");
		d.add("c");
		
		String actual = p.findLongestWord(s, d);
		
		assertEquals("a", actual);
	}
	public void testFindLongestWord03() {
		String s = "abpcplea";
		List<String> d = new ArrayList<String>();
		d.add("ela");
		d.add("elppa");
		d.add("key");
		d.add("please");
		
		String actual = p.findLongestWord(s, d);
		
		assertEquals("", actual);
	}

} // end of class.
