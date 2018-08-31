package com.capgemini.day2;

public class Missing {

	

	public static int find(int[] input, int length) {
		int temp;
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length-2-i;j++)
			{
				if(input[j]>input[j+1])
				{
					temp=input[j+1];
					input[j+1]=input[j];
					input[j]=temp;
				}
			}
		}
		int i=0;
		while (i<length-1) {
			if(i!=input[i]) {
				return i;
			}
			i++;
		}
		int x=-1;
		return x;
		
	}

}
