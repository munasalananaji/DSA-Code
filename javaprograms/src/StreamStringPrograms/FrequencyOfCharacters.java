package StreamStringPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		
		String s ="nanajiMunasala";
//		char c[] = s.toLowerCase().toCharArray();
		
		Map<Character, Long> result =  s.chars().mapToObj(a -> (char)a).
				                       collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Each character frequency is "+result);
		

	}

}
