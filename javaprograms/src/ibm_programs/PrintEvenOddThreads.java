package ibm_programs;

public class PrintEvenOddThreads {
	
	public static void main(String[] args)
	{
		
		EvenOdd e = new EvenOdd();
		Thread t1 = new Thread(e::even);
		Thread t2 = new Thread(e::odd);
		t1.start();t2.start();
		
	}
	

}


class EvenOdd
{
	private int num =0;
	private int max =10;
	
	synchronized public void even()
	{
		while(num<=max)
		{
			if(num%2!=0)
			{
				try
				{
					wait();
				}
				catch(Exception e)
				{
					System.out.println("Prmint the exception");
				}
			}
			else
			{
				System.out.println("Thread name "+Thread.currentThread().getName()+" and num is "+num++);
				notify();
			}
		}
	}
	synchronized public void odd()
	{
		while(num<=max)
		{
			if(num%2==0)
			{
				try
				{
					wait();
				}
				catch(Exception e)
				{
					System.out.println("Prmint the exception");
				}
			}
			else
			{
				System.out.println("Thread name "+Thread.currentThread().getName()+" and num is "+num++);
				notify();
			}
		}
	}
}
