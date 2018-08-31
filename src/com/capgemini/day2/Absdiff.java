package com.capgemini.day2;

public class Absdiff {

	public static int check(int[] input, int k)
	{
		int size=input.length;
		int flag=0;
		for(int i = 0; i < size-1; i++)
		{
			for(int j = i+1; j < size; j++)
			{
				if(Math.abs(i-j) <= k)
				{
					if(input[i]==input[j])
					{
						System.out.println("Such a pair exists at " + (i+1) + " and " + (j+1));
						flag=1;
					}
				}
			}
		}
		if(flag==1)
		{
			return 1;
		}
		System.out.println("No pairs found.");;
		
		return 0;
	}

}
