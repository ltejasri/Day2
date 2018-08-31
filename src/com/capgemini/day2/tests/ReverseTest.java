package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Reverse;

class ReverseTest {

	@Test
	void testfindAllReverse() 
	{
		assertEquals("irsajet ", Reverse.findAllReverse("tejasri"));
	}

}
