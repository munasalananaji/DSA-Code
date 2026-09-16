package com.nani.comparable;
import java.util.*;

public class ComprableInterfaceJava {
	public static void main(String[] args)
	{
		List<Movie1> list = Arrays.asList(new Movie1(100, "KRamp"), new Movie1(50, "Mr Sampu"),new Movie1(20, "TGD"));
		Collections.sort(list);
		for(Movie1 m : list)
		{
			System.out.println("Printing the movie "+m.getName());
		}
	}

}

class Movie1 implements Comparable<Movie1>
{
	private int price;
	private String name;
	

	public Movie1(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	




	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	@Override
	public int compareTo(Movie1 o) {
		if(this.price > o.price)
		{
			return -1;
		}
		else if(this.price<o.price)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
}
