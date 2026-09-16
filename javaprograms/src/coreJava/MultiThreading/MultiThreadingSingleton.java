package coreJava.MultiThreading;

public class MultiThreadingSingleton {
	
	private static MultiThreadingSingleton instance = null;
	private MultiThreadingSingleton() {}
	public static MultiThreadingSingleton getInstance()
	{
		if(instance==null)
		{
			synchronized(MultiThreadingSingleton.class) {
			if(instance ==null)
			{
				instance = new MultiThreadingSingleton();
			}
			}
		}
		return instance;
	}
	

}
