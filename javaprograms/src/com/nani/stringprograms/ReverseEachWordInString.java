package com.nani.stringprograms;
/* Reverse each word in a string */
public class ReverseEachWordInString {
	public static void main(String[] args)
	{
		String word = "How are you";
		String reversedWord = "";
		String individualWord[] = word.split(" ");
		for(String s : individualWord)
		{
			reversedWord += reverse(s)+" ";
		}
		System.out.println(reversedWord.trim());
		
		
	}
	
	public static String reverse(String a)
	{
		return new StringBuilder(a).reverse().toString();
	}

}
