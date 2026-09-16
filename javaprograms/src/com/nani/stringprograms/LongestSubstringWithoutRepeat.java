package com.nani.stringprograms;
import java.util.*;
public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {
        String s = "abcwaertymnbvcxzlkjhgfdsapoiuquialkjhgmnbvcxzlkjhgfdsapoiu";
        int max = 0, left = 0, start =0;
        Map<Character, Integer> m = new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
        	if(m.containsKey(s.charAt(i))&& m.get(s.charAt(i))>left)
        	{
        		left = m.get(s.charAt(i))+1;
        	}
        	m.put(s.charAt(i), i);
        	int length = i-left+1;
        	if(length>max)
        	{
        		max = length;
        		start = left;
        	}
        }
        System.out.println("Longest Substring is "+s.subSequence(start, start+max));
        
        

        
    }
}

