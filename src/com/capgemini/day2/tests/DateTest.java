package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Date;

class DateTest {

	@Test
	void testfindAllDate()
	{
		assertEquals("10/jan/2018", Date.findAllDate("10,01,2018"));
	}
}
