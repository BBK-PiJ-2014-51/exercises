package exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedListTest {
	private static final int TEST_NUMBER = 511;
	
	@Test
	public void BinarySearchTest() {
		SortedList list = new SortedList();
		list.add(TEST_NUMBER);
		for (int i = 0; i < 100; i ++){
			list.add(Math.abs(1000 * Math.random()));
		}
		assertEquals(true, list.binarySearch(TEST_NUMBER));
	}

}
