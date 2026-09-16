package non_string.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to verify");
		int a = sc.nextInt();
		int temp =a;
		int length = String.valueOf(153).length();
		int result= 0;
		
		while(temp>0)
		{
			int n = temp%10;
			result += Math.pow(n, length);
			temp /= 10;
			
		}
		if(result == a)
		{
			System.out.println("The given num "+a+" is a Armstrong");
		}
		else
		{
			System.out.println("Given number "+a+"is not a Armstring");
		}
	}
}
