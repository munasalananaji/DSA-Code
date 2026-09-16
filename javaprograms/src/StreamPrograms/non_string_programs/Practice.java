package StreamPrograms.non_string_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {

	public static void main(String[] args) {
		String s ="I am nanaji munasala and nanaji munasala studient in vishaka and";
		
	Set<Entry<String, Long>> m=	Arrays.asList(s.split(" ")).stream().collect(Collectors.groupingBy(a->a, Collectors.counting()))
			.entrySet().stream().filter(k -> k.getValue()>1).collect(Collectors.toSet());
	
		
	 System.out.println(m);
	 
	
	}

}

class Flow 
{
	private int petals;
	private String color;
	
	public Flow(int petals, String color) {
		super();
		this.petals = petals;
		this.color = color;
	}
	public int getPetals() {
		return petals;
	}
	public void setPetals(int petals) {
		this.petals = petals;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Flow [petals=" + petals + ", color=" + color + "]";
	}
	
	
}

class ColorComprator implements Comparator<Flow>
{

	@Override
	public int compare(Flow o1, Flow o2) {
		// TODO Auto-generated method stub
		return o1.getColor().compareToIgnoreCase(o2.getColor());
	}

	
}
