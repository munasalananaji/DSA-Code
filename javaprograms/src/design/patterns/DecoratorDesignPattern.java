package design.patterns;

public class DecoratorDesignPattern {
	
	public static void main(String[] args)
	{
		System.out.println("Please make a order of tea");
		System.out.println("The cost of blactea is "+new Blacktea().cost()+"\nCost of Tea with milk is "+ new MilkTea().cost());
	}

}

interface TeaHub
{
	int cost();
}
class Blacktea implements TeaHub
{

	@Override
	public int cost() {// TODO Auto-generated method stub
		return 10;
	}
	
}
class MilkTea implements TeaHub
{

	TeaHub t = new Blacktea();
	@Override
	public int cost() {// TODO Auto-generated method stub
		return t.cost()+10;
	}
	
}