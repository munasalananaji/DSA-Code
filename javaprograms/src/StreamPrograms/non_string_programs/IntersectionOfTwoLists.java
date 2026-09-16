package StreamPrograms.non_string_programs;
import java.util.*;
import java.util.stream.Collectors;
public class IntersectionOfTwoLists {

	public static void main(String[] args)
	{
		List<Integer> list1 = Arrays.asList(1,2,7,4,23,2,5,84,12);
		List<Integer> list2 = Arrays.asList(21,3,6,75,43,2,23,12);	
		List<Integer> finalList = list1.stream().filter(a -> list2.contains(a)).collect(Collectors.toList());
		System.out.println("FinalList interstion of two lists"+finalList);
	}

}
