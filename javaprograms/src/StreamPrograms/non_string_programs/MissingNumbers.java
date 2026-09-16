package StreamPrograms.non_string_programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {
	
	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<>(Arrays.asList(1,4,7,9,10));
		int min = Collections.min(l);
		int max = Collections.max(l);
		
		List<Integer> missingElements = IntStream.range(min, max).filter(a -> !l.contains(a)).boxed().collect(Collectors.toList());
		System.out.println("Missing numbers from the above list is "+missingElements);
		
		//Adding these missing elements into the original list
		l.addAll(missingElements);
		Collections.sort(l);
		System.out.println("All elements including the missing ones are => "+l);

	}

}
