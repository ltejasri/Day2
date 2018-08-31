package com.capgemini.day2;

public class Cui {

	public static int checkId(String userid, String password, String id, String pass) {
		// TODO Auto-generated method stub
		if(userid.equals(id) && pass.equals(password))
		{
			return 1;
			}
		else
		return 0;
	}

}
