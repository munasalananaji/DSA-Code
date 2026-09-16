package com.nani.stringprograms;

/* Longest Substring in a sentence */
/* Second Longest SubString in a sentence */
public class LongestSubString {

	public static void main(String[] args) {
		String sentence ="I Love my Country and I proud of it";
		
		String[] splitWords = sentence.split(" ");
		String longestString = splitWords[0];
		String secondLongest ="";
		for(int i =1; i<splitWords.length;i++)
		{
			if(splitWords[i].length()>longestString.length())
			{
				secondLongest = longestString;
				longestString = splitWords[i];
			}
			else if(secondLongest.length()<splitWords[i].length() )
			{
				secondLongest = splitWords[i];
			}
		}
		System.out.println(longestString);
		System.out.println("Second Longest substring is "+ secondLongest);
		
	}

}
