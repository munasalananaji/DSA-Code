package ibm_programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetDuplicateStream {
	public static void main(String[] args)
	{
		int[] a = {5,6,2,5,6,2,9,5,2};
		
		Set<Integer> s = new LinkedHashSet<>();
		
	Set<Integer> result = 	Arrays.stream(a).filter(k -> !s.add(k)).boxed().collect(Collectors.toSet());
	System.out.println(result);
	
	//without streams
	Set<Integer> seen = new HashSet<>();
	Set<Integer> dup = new HashSet<>();
	for(int a1: a)
	{
		if(!seen.add(a1))
		{
			dup.add(a1);
		}
	}
   System.out.println(dup);
   
 	}
	
	
	

}
