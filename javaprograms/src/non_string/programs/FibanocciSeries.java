package non_string.programs;

public class FibanocciSeries {
	public static void main(String[] args)
	{
		int a =0;
		int b =1;
		System.out.print(a+", "+b+", ");
		for(int i =0;i<=10;i++)
		{
			int s = a+b;
			System.out.print(s +", ");
			a =b;
			b=s;
		}
	}

}
