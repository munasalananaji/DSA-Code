package design.patterns;

import design.patterns.House.HouseBuilder;

public class BuilderDesignPattern {
	
	public static void main(String[] args)
	{
		
		House h = new House.HouseBuilder().walls("10").floors(2).pool(false).build();
		System.out.println(h.toString());
		House h1 = new House.HouseBuilder().walls("100").floors(1).build();
		System.out.println(h1.toString());
		
		
	}

}

class House
{
	private String walls;
	private int noOfFloors;
	private boolean pool;
	
	public House(HouseBuilder houseBuilder) {
		super();
		this.walls = houseBuilder.walls;
		this.noOfFloors = houseBuilder.noOfFloors;
		this.pool = houseBuilder.pool;
	}
	
	
	@Override
	public String toString() {
		return "House [walls=" + walls + ", noOfFloors=" + noOfFloors + ", pool=" + pool + "]";
	}


	public String getWalls() {
		return walls;
	}
	public void setWalls(String walls) {
		this.walls = walls;
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public boolean isPool() {
		return pool;
	}
	public void setPool(boolean pool) {
		this.pool = pool;
	}
	
	static class HouseBuilder
	{
		private String walls;
		private int noOfFloors;
		private boolean pool;
	
		public  HouseBuilder walls(String walls)
		{
			this.walls= walls;
			return this;
			
		}
		public HouseBuilder floors(int noOfFloors)
		{
			this.noOfFloors= noOfFloors;
			return this;
			
		}
		public HouseBuilder pool(boolean pool)
		{
			this.pool= pool;
			return this;
			
		}
		
		public House build()
		{	
			return new House(this);
			
		}
		
		
	}
	
	
}

