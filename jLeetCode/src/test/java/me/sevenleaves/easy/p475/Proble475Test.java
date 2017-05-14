/**
 * @author Victor Young
 */
package me.sevenleaves.easy.p475;

import junit.framework.TestCase;

/**
 * @author Victor Young
 * @Todo: 
 *
 */
public class Proble475Test extends TestCase {

	private Proble475 p = new Proble475();
	
	public final void testFindRadius01() {
		int[] houses = {1,2,3};
		int[] heaters = {2};
		
		assertEquals(1, p.findRadius(houses, heaters));
	}
	
	public final void testFindRadius02() {
		int[] houses = {1,2,3,4};
		int[] heaters = {1,4};
		
		assertEquals(1, p.findRadius(houses, heaters));
	}
	
	public final void testFindRadius03() {
		int[] houses = {1,5};
		int[] heaters = {2};
		
		assertEquals(3, p.findRadius(houses, heaters));
	}
	
	public final void testFindRadius04() {
		int[] houses = {1,2,3,5,15};
		int[] heaters = {2,30};
		
		assertEquals(13, p.findRadius(houses, heaters));
	}
	
	public final void testFindRadius05() {
		int[] houses = {9, 10, 11};
		int[] heaters = {1,10,300};
		
		assertEquals(1, p.findRadius(houses, heaters));
	}
	
	public final void testFindRadius06() {
		int[] houses = {282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
		int[] heaters = {823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
		
		assertEquals(161834419, p.findRadius(houses, heaters));
	}
	
	public final void testSearchInsert01() {
		int[] nums = {1,3,5,6};
		int target = 5;
		
		assertEquals(2, p.searchInsert(nums, target));
	}
	
	public final void testSearchInsert02() {
		int[] nums = {1,3,5,6};
		int target = 2;
		
		assertEquals(1, p.searchInsert(nums, target));
	}
	
	public final void testSearchInsert03() {
		int[] nums = {1,3,5,6};
		int target = 7;
		
		assertEquals(4, p.searchInsert(nums, target));
	}
	
	public final void testSearchInsert04() {
		int[] nums = {1,3,5,6};
		int target = 0;
		
		assertEquals(0, p.searchInsert(nums, target));
	}
	
	public final void testSearchInsert05() {
		int[] nums = {1};
		int target = 0;
		
		assertEquals(0, p.searchInsert(nums, target));
	}
	
}
