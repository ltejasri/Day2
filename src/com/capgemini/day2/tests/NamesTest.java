package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Names;

class NamesTest {

	@Test
	void testCount()
	{
		String names[]= {"Dave","Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dey", "Kity", "Meery", "Smith", "Johnson", 
				"Bill", "Williams", "Jones","Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson" };
		assertEquals(2,Names.countRepeat(names,"Sam"));
		
	}

}
