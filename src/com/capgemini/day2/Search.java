package com.capgemini.day2;

public class Search
{

	public static String ElementSearchInArray(int[] ar, int val)
	{
		for(int i=0;i<=14;i++)
		{
			if(ar[i] == val)
			{
				String found = "Element exists in the array";
				return found;
			}
		}
		String notfound = "Element does not exist int the array";
		return notfound;
	}
	
}
