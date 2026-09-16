package StreamPrograms.non_string_programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* concated the two list of arrays*/
public class MergeTwoListAndSort {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,7,4,23,2,5,84,12);
		List<Integer> list2 = Arrays.asList(21,3,6,75,43,2);	
		List<Integer> concatedList = Stream.concat(list1.stream(), list2.stream())
				                     .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Contcated descending ordered list is "+concatedList);

	}

}
