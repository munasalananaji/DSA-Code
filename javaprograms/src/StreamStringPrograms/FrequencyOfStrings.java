package StreamStringPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfStrings {
	
	public static void main(String[] args)
	{
		String s ="I am nanaji munasala and nanaji munasala studient in vishaka and";
		
		Map<String, Long> result = Stream.of(s.split(" ")).
				                   collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Printing the repeated strings "+result);
	}

}
