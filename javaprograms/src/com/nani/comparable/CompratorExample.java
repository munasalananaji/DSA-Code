package com.nani.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompratorExample {
	public static void main(String args[])
	{
		List<Mov> list = Arrays.asList(new Mov(100, "KRamp"), new Mov(50, "Mr Sampu"),new Mov(20, "AGD"));
		Collections.sort(list, new MovieNameComparator());
		for(Mov l :list)
		{
			System.out.println("Printing the names of movies "+l.getName());
		}
	}

}

class MovieNameComparator implements Comparator<Mov>
{
	

	@Override
	public int compare(Mov o1, Mov o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

class Mov 
{
	private int price;
	private String name;
	

	public Mov(int price, String name) {
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


}
