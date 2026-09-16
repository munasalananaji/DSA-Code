package practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,32,10,15);
		/*Given a list of integers, find out all the even numbers that exist in the list using Stream functions?*/
		Map<Boolean, List<Integer>> l =list.stream().collect(Collectors.partitioningBy(a-> a%2==0));
		System.out.println("Even numbers from the list is "+l.get(true));
		
		/*Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/
		System.out.println("Given a list of integers, find out all the numbers starting with 1 using Stream functions");
		list.stream().map(a->a.toString()).filter(k -> k.startsWith("1")).forEach(System.out::println);
		
		/*How to find duplicate elements in a given integers list in java using Stream functions*/
		System.out.println("How to find duplicate elements in a given integers list in java using Stream functions");
		list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(a -> a.getValue()>1).map(b->b.getKey()).collect(Collectors.toList()).forEach(System.out::println);
		
		/*Given a list of integers, find the total number of elements present in the list using Stream functions*/
		System.out.println("Given a list of integers, find the total number of elements present in the list using Stream functions");
		long totalElements =list.stream().count();
		System.out.println(totalElements);
		
		/*Given a list of integers, find the maximum value element present in it using Stream functions*/
		System.out.println("Given a list of integers, find the maximum value element present in it using Stream functions");
		Integer biggestNum = list.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(biggestNum); 
		
		
		
		
		
	}

}
