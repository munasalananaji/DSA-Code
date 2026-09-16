package StreamStringPrograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s = "n_n_ji";
		/*Write a program to replace the character and fill with the correct letter*/
		
		String AfterReplacingCharacter = s.chars().mapToObj(a -> (char)a).map(k -> k=='_' ? String.valueOf("a"):k.toString())
				                         .collect(Collectors.joining());
		System.out.println("After replacing the characters "+AfterReplacingCharacter);
		

	}

}
