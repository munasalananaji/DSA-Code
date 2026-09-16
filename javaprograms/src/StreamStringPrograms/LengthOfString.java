package StreamStringPrograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LengthOfString {
	
	public static void main(String[] args)
	{
		/* Given string is nanaji */
		
		String s ="nanaji";
		int k = Stream.of(s).mapToInt(String::length).sum();
		System.out.println("Length of the string is "+k);
		
	}

}
