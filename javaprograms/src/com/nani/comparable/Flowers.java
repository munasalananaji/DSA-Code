package com.nani.comparable;

public class Flowers {
	
	private String name;
	private String numOfPetals;
	private int price;
	
	
	
	public Flowers(String name, String numOfPetals, int price) {
		super();
		this.name = name;
		this.numOfPetals = numOfPetals;
		this.price = price;
	}
	
	



	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getNumOfPetals() {
		return numOfPetals;
	}





	public void setNumOfPetals(String numOfPetals) {
		this.numOfPetals = numOfPetals;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public int compareTo(Object obj)
	{
		Flowers f = (Flowers)obj;
		
		if(this.price>f.price)
		{
			return 1;
		}
		else if(this.price<f.price)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	

}
