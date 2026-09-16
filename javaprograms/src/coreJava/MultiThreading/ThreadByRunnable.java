package coreJava.MultiThreading;

public class ThreadByRunnable implements Runnable {
	
	public static void main(String[] args)
	{
		System.out.println("Name of the main thread is "+ Thread.currentThread().getName());
		Thread t = new Thread(new ThreadByRunnable());
		t.start();
	}

	@Override
	public void run() {
		try {
			System.out.println("Name of the Runnable thread is "+ Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Waited for the 2 seconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}

