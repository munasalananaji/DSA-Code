package com.nani.stringprograms;

import java.util.*;


public class FirstUniqueCharacter {
	public static void main(String[] args)
	{
		String s ="nanaji";
		Map<Character, Integer> result = new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			result.put(s.charAt(i), result.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(result);
		for(Map.Entry<Character, Integer> m : result.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println("First unique character in a string is "+m.getKey());
				break;
			}
		}
	}

}
