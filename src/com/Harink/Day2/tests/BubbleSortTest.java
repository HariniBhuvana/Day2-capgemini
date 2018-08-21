package com.Harink.Day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Harink.java.programs.BubbleSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class BubbleSortTest {
       @Test
			void testBubbleSort() {
				assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9} ,BubbleSort.bubbleSort(new int[] {7,8,9,6,5,4,2,1,3}));
				assertArrayEquals(new int[] {-8,1,2,3,4,5,6,7,9} ,BubbleSort.bubbleSort(new int[] {7,-8,9,6,5,4,2,1,3}));

			}

		
	}


