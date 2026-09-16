package coreJava.MultiThreading;

public class ThreadExample  {
	public static void main(String[] s)
	{
		ThreadClass t = new ThreadClass();
		t.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}

class ThreadClass extends Thread
{	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Printint this is another thread");
	}
}
