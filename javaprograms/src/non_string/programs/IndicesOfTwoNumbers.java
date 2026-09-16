package non_string.programs;
import java.util.*;

/*Find the two indices from an array of integers which matches the target 4*/

public class IndicesOfTwoNumbers {
	public static void main(String[] args)
	{
		int[] n = {1, 2, 0, 3, 4, 5, 2};
	     int target = 4;
	     
	     for(int i =0;i<n.length-1;i++)
	     {
	    	 int a = n[i];
	    	 for(int j =i+1; j<n.length;j++)
	    	 {
	    		 int b = n[j];
	    		 int sum = a+b;
	    		 if(sum == target)
	    		 {
	    			 System.out.println("The index and numbers of the array is "+" index  => "+i+" value "+n[i]+
	    					 "\nindex  => "+j+" value "+n[j]);
	    		 }
	    	 }
	     }
	     System.out.println("=============================================================================");
	     //TimeComplexity 0(n)
	     Map<Integer, Integer> m = new HashMap<>();
	     for(int i =0; i<n.length;i++)
	     {
	    	 int k = target - n[i];
	    	 if(m.containsKey(k))
	    	 {
	    		 System.out.println(" Second Iteration The index and numbers of the array is "+" index  => "+i+" value "+n[i]+
    					 "\nindex  => "+m.get(k)+" value "+k);
	    	 }
	    	 m.put(n[i], i);
	     }
	     

	}
	 
}
