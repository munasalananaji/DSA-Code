package coreJava.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallbleFuture {

	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> res = service.submit(new MyCallable());
		try {
			System.out.println("Name of the thread "+ Thread.currentThread().getName());
			System.out.println(res.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class MyCallable implements Callable<Integer>
{
	public Integer call()
	{
		System.out.println("Name of the callable thread "+ Thread.currentThread().getName());
		System.out.println("I entered into this method");
		return 10;
		
	}
}
