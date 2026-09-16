package StreamPrograms.non_string_programs;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args)
	{
		List<Integer> list1 = Arrays.asList(1,2,7,4,23,2,5,84,12);
		
		List<Integer> finalList = list1.stream().distinct().collect(Collectors.toList());
		System.out.println("removed the duplicates from the stream "+finalList);
		
	}
}
