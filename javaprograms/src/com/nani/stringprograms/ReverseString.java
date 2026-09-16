package com.nani.stringprograms;

public class ReverseString {
	public static String ReversedString="";
	
	public static void main(String[] args)
	{
		String a = "nani";
		for(int i =0; i<a.length();i++)
		{
		  ReversedString = a.charAt(i)+ReversedString;
		}
		System.out.println("Printing the revresed String "+ReversedString);
	}
	

}
