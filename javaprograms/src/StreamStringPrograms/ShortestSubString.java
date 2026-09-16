package StreamStringPrograms;

import java.util.Comparator;
import java.util.stream.Stream;

public class ShortestSubString {

	public static void main(String[] args) {
		String s ="I am the strongest person";
		
		String result = Stream.of(s.split(" ")).min(Comparator.comparingInt(String::length)).get();
		System.out.println("Printing the shortest string from the given input is "+result);

	}

}
