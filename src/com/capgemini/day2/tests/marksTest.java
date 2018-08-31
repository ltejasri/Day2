package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Marks;

class marksTest {

	@Test
	void testFindAllmarks()
	{
		assertEquals("Passed",Marks.calculateG(70,70,70));
		assertEquals("Promoted",Marks.calculateG(50,70,70));
		assertEquals("Failed",Marks.calculateG(50,50,50));
		
	}
	

}
