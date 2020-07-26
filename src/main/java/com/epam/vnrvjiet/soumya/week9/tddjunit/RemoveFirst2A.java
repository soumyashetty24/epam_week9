package com.epam.vnrvjiet.soumya.week9.tddjunit;

public class RemoveFirst2A {
	public String remove(String inputString) 
	{
		
		String resultString="";
		
		if(inputString.length()<2)
		{
			if(inputString.length()==0 || (inputString.length()==1 && inputString.charAt(0)=='A'))
			{
				resultString="";
			}
			else
			{
				resultString=inputString;
			}
		}
		else
		{
			if(inputString.charAt(0)=='A' && inputString.charAt(1)=='A')
			{
				resultString=inputString.substring(2,inputString.length());
			}
			else if(inputString.charAt(0)=='A')
			{
				resultString=inputString.substring(1,inputString.length());
			}
			else if(inputString.charAt(1)=='A')
			{
				resultString=inputString.charAt(0)+inputString.substring(2,inputString.length());
			}
		}
		return resultString;
	}
	

}
