package coreJava.MultiThreading;

public class SynchronizedExample {

	public static void main(String[] args) {
		Account account = new Account();
		Thread t1 = new Thread(()->account.withdraw(700, "user1"));
		Thread t2 = new Thread(()->account.withdraw(600, "user2"));
		t1.start();
		t2.start();
	
	}

}
class Account
{
	public int balance = 1000;
	public boolean status = false;
    synchronized public void withdraw(int amount, String user)
	{
    	System.out.println("Printing the name of the threads "+Thread.currentThread().getName());
    	
    	if(user.equals("user1"))
    	{
    		System.out.println("I came here first "+Thread.currentThread().getName());
    		while(!status)
    		{
    			try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
    	
		if(balance>amount)
		{
			balance -= amount;
			System.out.println("You have withdrawn the amount of "+amount+" rupees and remaining is "+balance);
		}
		else
		{
			System.out.println("You cannot withdraw "+amount+" as your balance is low "+balance);
		}
		
		if(user.equals("user2"))
		{
			status = true;
			notifyAll();
		}
    	
	}
}
