package com.Harink.Day2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.AbsoluteDifference;

public class AbsoluteDifferenceTest {
	
	
		@Test
		void testFindAbsoluteDiff() {
			assertEquals(true, AbsoluteDifference.findAbsoluteDifference(new int[] {10, 80, 30, 60, 10, 40}, 5));
		}

	}

