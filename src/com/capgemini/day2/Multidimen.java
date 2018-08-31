package com.capgemini.day2;

public class Multidimen {

	public static int search(int[][] elements, int rows, int columns, int search) {
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(search==elements[i][j])
				{
					return 1;
				}
			}
		}
		return 0;
	}
}
