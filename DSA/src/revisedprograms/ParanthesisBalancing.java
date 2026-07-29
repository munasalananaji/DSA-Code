package revisedprograms;

import java.util.Stack;

public class ParanthesisBalancing {
    static void main(String[] args) {
        String s = "{([[]])}(())";
        System.out.println("Is parenthesis balanced ... ? "+ parethesisBalance(s));
    }

    private static boolean parethesisBalance(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        for(char ch : s.toCharArray())
        {
            if (ch =='(' || ch =='{' || ch =='[')
            {
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) return  false;

                char pop = stack.pop();
                if(ch==')' && pop!= '(' || ch =='}' && pop!='{' ||  ch==']' &&  pop!='[')  return false;

            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
