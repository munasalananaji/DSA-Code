package design.patterns;

public class MultiThreadingSingletonDesignPattern {

	 private static MultiThreadingSingletonDesignPattern instance = null;
	 private MultiThreadingSingletonDesignPattern() {};
	 public static MultiThreadingSingletonDesignPattern getInstance()
	 {
		 if(instance == null)
		 {
			 synchronized(MultiThreadingSingletonDesignPattern.class)
			 {
				 if(instance ==null)
				 {
					 instance = new MultiThreadingSingletonDesignPattern();
				 }
			 }
		 }
		 return instance;
	 }
	 
}
