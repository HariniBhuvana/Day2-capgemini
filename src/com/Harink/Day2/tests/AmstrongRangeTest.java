package com.Harink.Day2.tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;

import com.Harink.java.programs.AmstrongRange;

class AmstrongRangeTest {

	@Test
	void findAllAmstrongNumbers() {
		assertArrayEquals(new int[] {153, 370, 371, 407, 0, 0, 0, 0, 0, 0},AmstrongRange.findAllAmstrongNumbers(100, 1000));
		
	}

}
