package coreJava.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutor {
	public static void main(String[] args)
	{
		ExecutorService ex = Executors.newFixedThreadPool(3);
		ex.submit(() -> {System.out.println("Printing the name of the thread in Executor "+Thread.currentThread().getName());});
	}

}


