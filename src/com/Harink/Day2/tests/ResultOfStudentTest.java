package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.ResultOfStudent;

class ResultOfStudentTest {

	@Test
	void testCheckResult() {
		assertEquals("Passed", ResultOfStudent.checkResult(60,60,60));
		assertEquals("Promoted", ResultOfStudent.checkResult(60,60,30));
		assertEquals("Failed", ResultOfStudent.checkResult(60,30,30));
	}

}
