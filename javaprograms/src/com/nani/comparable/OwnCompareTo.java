package com.nani.comparable;

/* Printing the highest price flower */
public class OwnCompareTo  {

	
	public static void main(String[] args)
	{
		Flowers [] s = {new Flowers("jasmine", "12",10000), new Flowers("rose", "12",10888800),
				new Flowers("Lotus", "2",200),new Flowers("SunFlower", "120",2000)};
		
		Flowers biggestFlower = s[0];
		
		for(int i =1;i<s.length;i++)
		{
			if(s[i].compareTo(biggestFlower)>0)
			{
				biggestFlower = s[i];
			}
		}
		System.out.println("Biggest Flower is "+biggestFlower.getName());
		
		
	}

}
