package ibm_programs;
import java.util.*;

public class TwoSum {
	
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int target = 20;
		Map<Integer, Integer> m = new HashMap<>();
		for(int i =0;i<a.length;i++)
		{
			int t = target - a[i];
			
			if(m.containsKey(t))
			{
				System.out.println("The elemets to make 20 from list are "+a[i] +" and "+t);
			}
			m.put(a[i], i);
			
		}
		
	}

}
