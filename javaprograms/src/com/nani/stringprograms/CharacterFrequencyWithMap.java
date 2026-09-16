package com.nani.stringprograms;

import java.util.*;
/* Character frequency using Map collection: */
public class CharacterFrequencyWithMap {

	public static void main(String[] args) {
		
		String s = "nanajimunasala";
		Map<Character, Integer> m = new HashMap<>();
		for(int i =0; i<s.length();i++)
		{
			m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0)+1);
		}
		
		System.out.println("Printing the frequency "+m);

	}

}
