package StreamPrograms.non_string_programs;

import java.util.*;

public class FindNthSmallestNumber {
	
	/* Find the 3rd smallest number*/
	
	public static void main(String[] args)
	{
		List<Integer> l = Arrays.asList(2,5,7,12,56,87,2,43,6,5,1,54,6,7234,21);
	    int ThirdSmallestNumber =	l.stream().sorted().skip(3).limit(1).findFirst().get();
	    
	    System.out.println("Third smallest number from the list is "+ThirdSmallestNumber);
	 
	}

}
