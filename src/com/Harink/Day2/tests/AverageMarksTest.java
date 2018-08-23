package com.Harink.Day2.tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.Harink.java.programs.AverageMarks;

class AverageMarksTest {

	@Test

	void testStudentAverage() {
		assertArrayEquals(new double[] {2.0, 5.0, 8.0}, AverageMarks.findAverageAndTotal(new double[][] {{1,2,3},{4,5,6},{7,8,9}}));
		
	}
	
	@Test
	void testSubjectAverage() {
		assertArrayEquals(new double[] {4.0, 5.0, 6.0}, AverageMarks.findAverageAndTotal(new double[][] {{1,2,3},{4,5,6},{7,8,9}}));
	}
}
