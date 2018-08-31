package com.capgemini.day2;

public class Marks
{
	
	public static String calculateG (int m1, int m2, int m3) 
	{
		if(m1 > 60 && m2 > 60 && m3 > 60)
		{
			return "Passed";
		}
		else if(m1>60 && m2>60 || m2>60 && m3>60 || m3>60 && m1>60)
		{ 
			return "Promoted";
		}
		else 
		{
			return "Failed";
		}

	}
}
