package StreamPrograms.non_string_programs;

import java.util.*;
import java.util.stream.Collectors;

public class EvenAndOdd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
	    Map<Boolean, List<Integer>> k =	numbers.stream().collect(Collectors.partitioningBy(a -> a%2==0));
	    System.out.println("Even numbers are "+k.get(true));
	    System.out.println("Odd numbers are "+k.get(false));
		
		  
	}

}
