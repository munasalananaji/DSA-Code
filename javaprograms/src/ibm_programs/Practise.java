package ibm_programs;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise {

	public static void main(String[] args) {
//		Sum of numbers program using java8 features
		
		int a[] = {2,5,8,9,18};
		Integer b[] = {0,6,5,2,9,12,56};
		
		
	List<Integer> l =	Arrays.stream(a).filter(k -> Arrays.asList(b).contains(k)).boxed().collect(Collectors.toList());
		
	

		
		System.out.println(l);
		
		
		

	}

}

