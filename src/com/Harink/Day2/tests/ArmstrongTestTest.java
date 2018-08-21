package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.Armstrong;

class ArmstrongTestTest {

	@Test
	
		public void testArmstrongCheck() {
			assertEquals(true, Armstrong.armstrongCheck(153));
			assertEquals(true, Armstrong.armstrongCheck(-153));
			assertEquals(false, Armstrong.armstrongCheck(203));
			assertEquals(false, Armstrong.armstrongCheck(0235));
			//assertEquals(true, Armstrong.armstrongCheck(00153));

		
	}

}
