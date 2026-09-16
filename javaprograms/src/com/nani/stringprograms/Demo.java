package com.nani.stringprograms;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
	  
	public static void main(String[] args)
	{ 
		String s ="nanaji";
	String res= "";
	for (int i =0;i<s.length();i++)
	{
		if(res.indexOf(s.charAt(i))==-1)
		{
			res += s.charAt(i);
		}
	}
	System.out.println(res);
		
		
	}
	
}
