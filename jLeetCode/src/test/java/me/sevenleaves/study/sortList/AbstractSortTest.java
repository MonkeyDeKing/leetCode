/**
 * @author Victor Young
 */
package me.sevenleaves.study.sortList;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class AbstractSortTest extends TestCase {

	AbstractSort s = new AbstractSort () {

		@Override
		public void sort(ListNode head) {
			// do nothing
		}
		
	};
	
	/**
	 * Test method for {@link me.sevenleaves.study.sortList.AbstractSort#less(me.sevenleaves.study.sortList.ListNode, me.sevenleaves.study.sortList.ListNode)}.
	 */
	public void testLess() {
		ListNode a = new ListNode(5);
		ListNode b = new ListNode(3);
		
		boolean actual = s.less(a, b);
		assertEquals(false, actual);
		
		actual = s.less(b, a);
		assertEquals(true, actual);
	}

	/**
	 * Test method for {@link me.sevenleaves.study.sortList.AbstractSort#show(me.sevenleaves.study.sortList.ListNode)}.
	 */
	public void testShow() {
		ListNode head = new ListNode(0);
		
		ListNode t = head;
		for (int i = 1; i < 9; i++) {
			t.next = new ListNode(i);
			t = t.next;
		}
		
		s.show(head);
	}

	/**
	 * Test method for {@link me.sevenleaves.study.sortList.AbstractSort#isSorted(me.sevenleaves.study.sortList.ListNode)}.
	 */
	public void testIsSorted() {
		ListNode head = new ListNode(0);
		
		ListNode t = head;
		for (int i = 1; i < 9; i++) {
			t.next = new ListNode(i);
			t = t.next;
		}
		
		boolean actual = s.isSorted(head);
		assertEquals(true, actual);
	}

}
