package com.capgemini.day2;

public class Bubble 
{

	public static int[] findAllBubbleNumbers (int[] ar)
	{
		//int ar[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47},tp;
		for(int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++)
			{
				if(ar[i]>ar[j])
				{
					int tp = ar[i];
					ar[i]=ar[j];
					ar[j]=tp;
				}
			}
		}
		for(int i=0;i<=14;i++)
		{
			System.out.println(ar[i]+" ");
		}
		return ar;
	}
	
	
	

}
