package StreamStringPrograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String s ="nanaji";
		String result = IntStream.rangeClosed(1, s.length()).mapToObj(a -> s.charAt(s.length()-a)).map(String::valueOf).collect(Collectors.joining());
		System.out.println(result);
	
		
	}

}
