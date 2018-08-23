package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.CorrectionSentences;

class CorrectionSentencesTest {

	@Test
	void testCorrectionSentence() {
		assertEquals("A MORNING WALK A IS BLESSING FOR THE WHOLE DAY. ", CorrectionSentences.correctionSentence("A   MORNING WALK IS A IS BLESSING FOR THE WHOLE DAY.", 4));
	}


}
