package com.java.algorithm.mergesort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

	MergeSort sort;
	private int[] sorted;
	private int[] nonSorted;


	@Before
	public void setUp() {
		System.out.println("Setup");
		sort = new MergeSort();
		nonSorted = new int[]{5, 6, 9, 10, 15, 1, 3, 4};
		sorted = new int[]{1, 3, 4, 5, 6, 9, 10, 15};
	}

	@Test
	public void sortShouldMergeSortAnArray() {
		System.out.println("sortShouldMergeSortAnArray");
		int[] result = sort.sort(nonSorted);
		assertNotNull(result);
		assertArrayEquals(sorted, result);
	}

	@Test(expected = java.lang.NullPointerException.class)
	public void sortShouldThrowAnException_For_ValueIsNull() {
		System.out.println("sortShouldThrowAnException_For_ValueIsNull");
		sort.sort(null);
	}

	@After
	public void teardown() {
		System.out.println("Teardown");
		sort = null;

	}
}
