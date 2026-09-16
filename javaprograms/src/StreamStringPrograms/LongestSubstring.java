package StreamStringPrograms;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;
/*Largest substring */
public class LongestSubstring {

	public static void main(String[] args) {
	
		String s = "Hello worldbiggest this is nanaji munasala";
		
	String result =	Stream.of(s.split(" ")).max(Comparator.comparingInt(String::length)).get();
	System.out.println("Printing the largest substring "+result);

	}

}
