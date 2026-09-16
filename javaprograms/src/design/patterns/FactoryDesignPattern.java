package design.patterns;

import java.util.Scanner;

public class FactoryDesignPattern {
	static int count =0;
	
	public static void main(String[] aths)
	{
		switchConcurrentMethods("Lions");
	}
	
	public static void switchConcurrentMethods(String animal)
	{
		switch (animal) {
		case "Lion" : Animal a = new Lion();
		a.sound();
		break;
		case "Cat" :Animal b =new Cat();
		b.sound();
		break;
		default :
			if(count<=2)
			{
			System.out.println("Invalid input please re-enter the input ");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			switchConcurrentMethods(s);
			count++;
			}
			
		}
	}

}

interface Animal
{
	void sound();
}
class Lion implements Animal
{
	public void sound()
	{
		System.out.println("Lion roars");
	}
}

class Cat implements Animal
{
	public void sound()
	{
		System.out.println("Cat sounds meow");
	}
}