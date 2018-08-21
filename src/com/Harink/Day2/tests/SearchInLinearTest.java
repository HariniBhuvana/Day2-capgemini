package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.SearchInLinear;

class SearchInLinearTest {

	@Test
	void testLinearSearch() {
		assertEquals("found", SearchInLinear.linearSearch(new int[] {1,2,3,4,5,6,7,8,9}, 2));
		assertEquals("not found", SearchInLinear.linearSearch(new int[] {1,2,3,4,5,6,7,8,9}, 12));
	}
}
