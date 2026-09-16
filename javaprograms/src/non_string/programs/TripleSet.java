package non_string.programs;

import java.util.Arrays;

public class TripleSet {
	
	public static void main(String[] args)
	{
		 int[] n = {1, 2, 0, 3, 4, 5, 2};
	     int target = 4;
	     Arrays.sort(n);
	     for(int i =0;i<n.length-2;i++)
	     {
	    	 int left = i+1;
	    	 int right = n.length-1;
	    	 while(left<right)
	    	 {
	    		 int sum = n[i]+n[left]+n[right];
	    		 if(sum==target)
	    		 {
	    			 System.out.println("Triple set elements are "+n[i]+", "+n[left]+", "+n[right]);
	    			 left++;right--;
	    		 }
	    		 else if(sum<target)
	    		 {
	    			 left++;
	    		 }
	    		 else
	    		 {
	    			 right--;
	    		 }
	    	 }
	     }
	  
	}

}
