package design.patterns;

public class AdopterDesignPattern {
	
	public static void main(String[] args)
	{
		GroceryProduct g = new GroceryProduct();
		Adopter a = new Adopter(g);
		System.out.println(a.getRestaurant());
	}

}

class Adopter implements RestaurentItem
{

	GroceryItem groceryItem;
	
	public Adopter(GroceryItem groceryItem) {
		super();
		this.groceryItem = groceryItem;
	}

	@Override
	public String getItem() {
		// TODO Auto-generated method stub
		return groceryItem.getItem();
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return groceryItem.getPrice();
	}

	@Override
	public String getRestaurant() {
		// TODO Auto-generated method stub
		return groceryItem.getGrocery();
	}
	
}

interface RestaurentItem
{
	String getItem();
	String getPrice();
	String getRestaurant();
}
interface GroceryItem
{
	String getItem();
	String getPrice();
	String getGrocery();
}
class FoodItem implements RestaurentItem
{

	@Override
	public String getItem() {
		// TODO Auto-generated method stub
		return "Biryani";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "250";
	}

	@Override
	public String getRestaurant() {
		// TODO Auto-generated method stub
		return "Mehfil";
	}
	
}

class GroceryProduct implements GroceryItem
{

	@Override
	public String getItem() {
		// TODO Auto-generated method stub
		return "Soap";
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return "176";
	}

	@Override
	public String getGrocery() {
		// TODO Auto-generated method stub
		return "Dmart";
	}
	
}
