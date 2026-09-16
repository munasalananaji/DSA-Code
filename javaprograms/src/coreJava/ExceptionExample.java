package coreJava;

import java.util.Scanner;

public class ExceptionExample {
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the member to check the age Criteria");
		int age = sc.nextInt();
		try
		{
		getAgeCriteria(age);
		}
		catch(Exception r)
		{
			System.out.println(r);
		}
	}
	public static void getAgeCriteria(int age) throws Exception
	{
		if(age>18)
		{
			System.out.println("Yes you are eligible for vote");
		}
		else
		{
			throw new NotEligibleException("You are not eligible to vote abbai or ammai %s" );
		}
	}

}
@SuppressWarnings("serial")
class NotEligibleException extends Exception
{

//	public String data;
	public NotEligibleException(String s)
	{
		super(s);
//		this.data = s;
	}
}
