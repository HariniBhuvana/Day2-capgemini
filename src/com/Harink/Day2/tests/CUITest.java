package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.CUI;

class CUITest {

	@Test
	void finduserandpassword() {
		assertEquals("welcome",CUI.finduserandpassword("abc","harin"));
		assertEquals("contact",CUI.finduserandpassword("abc","hain"));
		
		
		//fail("Not yet implemented");
	}

}
