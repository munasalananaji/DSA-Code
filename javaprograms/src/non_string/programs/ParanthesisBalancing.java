package non_string.programs;

import java.util.*;

public class ParanthesisBalancing {

	public static void main(String[] args) {
		String s = "[({})]";
		boolean unbalanced = false;
		
		Deque<Character> d = new ArrayDeque<>();
		
		for(char c : s.toCharArray())
		{
			if(c =='('||c =='{'||c =='[')
			{
				d.push(c);
			}
			else if(c ==')'||c =='}'||c ==']')
			{
				if(d.isEmpty())
				{
					unbalanced = true;
					break;
				}
				
				char open = d.pop();
				if(c ==')' && open!='('||c =='}' && open!='{'||c ==']' && open!='[')
				{
					unbalanced = true;
					break;
				}
			}
		}
		
		if(d.isEmpty() && !unbalanced)
		{
			System.out.println("Paranthesis is balanced");
		}
		else
		{
			System.out.println("Paranthesis is unbalanced");
		}
		
	}

}
