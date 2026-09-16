package com.nani.stringprograms;

/* String Without Duplicates */
public class StringWithOutDuplicates {

	public static void main(String[] args) {
		String s ="javadevelopment";

		System.out.println("Printing the String without duplicates "+withoutDuplicates(s));
	}

	public static String withoutDuplicates(String s) {
		
		String result = "";
		for(int i =0;i<s.length();i++)
		{
			if(result.indexOf(s.charAt(i))==-1)
			{
				result += s.charAt(i);
			}
		}
		return result;
	}

}
