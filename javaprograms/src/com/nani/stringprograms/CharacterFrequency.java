package com.nani.stringprograms;

/* character frequency */
public class CharacterFrequency {

	public static void main(String[] args) {
		String s ="nanaji";
		String withOutDuplicates = StringWithOutDuplicates.withoutDuplicates(s);
		for(int i =0;i<withOutDuplicates.length();i++)
		{
		   char a = withOutDuplicates.charAt(i);
		   int count =0;
		   for(int j =0;j<s.length();j++)
		   {
			   char b = s.charAt(j);
			   
			   if(a==b)
			   {
				   count++;
			   }
		   }
		   System.out.println("Occurences of the character in a string is "+a+"=> "+count);
		}

	}

}


