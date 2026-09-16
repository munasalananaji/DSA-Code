
package StreamStringPrograms;

import java.util.List;
import java.util.stream.Collectors;

public class StringWithOutDuplicates {

	public static void main(String[] args)
	{
		String s = "nanaji";
		
	List<Character> c =	s.chars().mapToObj(a -> (char)a).distinct().collect(Collectors.toList());
	System.out.println("Printing the characters with out duplicates "+c);
	
	/* To print as a String */
	
	String result  = s.chars().mapToObj(a -> (char)a).distinct().map(String::valueOf).collect(Collectors.joining());
	System.out.println("Printing the string with out duplicates => "+result);
	}
}
