package exercise5;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testMergeSort() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 25; i++){
			list.add((int) Math.abs(100 * Math.random()));
		}
		System.out.println(MergeSort.mergeSort(list).toString());
	}

}
