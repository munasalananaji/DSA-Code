package com.nani.stringprograms;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyUsingMap {
	public static void main(String[] args)
	{
		String s ="nanaji";
		Map<Character, Integer> result = new LinkedHashMap();
		for(int i=0;i<s.length();i++)
		{
			result.put(s.charAt(i), result.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(result);
		
		for(Map.Entry<Character, Integer> m : result.entrySet())
		{
			System.out.println(m.getKey() +" and "+m.getValue());
		}
		
		Map<Character, Long> result2 = s.chars().mapToObj(a -> (char)a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result2);
	}

}
