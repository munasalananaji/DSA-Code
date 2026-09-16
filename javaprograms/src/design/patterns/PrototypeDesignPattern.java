package design.patterns;

public class PrototypeDesignPattern {
	
	public static void main(String[] args)
	{
		TwoWheeler t = new TwoWheeler("2", "two StrokeEngine");
		Car c = new Car("4", "Four Stroke engine", "400 meteres chasis", true);
		System.out.println("printing the car object "+c.toString());
		System.out.println("Printing the two wheeler object "+t.toString());
		
	}

}

class TwoWheeler implements Cloneable
{
	private String tyres;
	private String engine;
	
	
	public TwoWheeler(String tyres, String engine) {
		super();
		this.tyres = tyres;
		this.engine = engine;
	}


	protected TwoWheeler clone() throws CloneNotSupportedException
	{
		return (TwoWheeler)super.clone();
	}


	@Override
	public String toString() {
		return "TwoWheeler [tyres=" + tyres + ", engine=" + engine + "]";
	}
	
	
}
class Car extends TwoWheeler
{
	
	private  String tyres;
	private  String engine;
	private String chasis;
	private boolean isElectric;
	
	public Car(String tyres, String engine,String chasis, boolean isElectric)
	{
		super(tyres, engine);
		this.chasis= chasis;
		this.isElectric = isElectric;
	}
	
	protected Car clone() throws CloneNotSupportedException
	{
		return (Car)super.clone();
	}

	@Override
	public String toString() {
		return "Car [tyres=" + tyres + ", engine=" + engine + ", chasis=" + chasis + ", isElectric=" + isElectric + "]";
	}
	
}
