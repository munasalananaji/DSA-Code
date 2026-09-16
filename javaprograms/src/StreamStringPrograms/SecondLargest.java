package StreamStringPrograms;

import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class SecondLargest {

	public static void main(String[] args)
	{
		String a = "hello world this is nanaji munasala";
	String result =	Stream.of(a.split(" ")).sorted(Comparator.comparingInt(String::length).reversed())
		                    .skip(1).limit(1).findFirst().get();
	System.out.println(result);
	}
}
