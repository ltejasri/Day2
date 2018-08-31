package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day2.Stringofpal;

class StringofpalTest {

	@Test
	void test() 
	{
		assertArrayEquals(new String[] {"121","787" , "545","454",null,null,null,null,null,null}, Stringofpal.OrderPalindromes(new String[] {"121","154","234","787","545","678","454","678","789","890"}));
	}

}
