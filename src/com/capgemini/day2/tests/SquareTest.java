package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Square;

class SquareTest {

	@Test
	void testfindSquare()
	{
		assertEquals(36, Square.findSquare(6));
	}

}
