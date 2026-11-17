package collection.stack.interviewQuestions;

import java.util.Stack;

public class QueueUsingStackEfficientremove {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackEfficientremove()
    {
        first = new Stack<>();
        second  = new Stack<>();
    }
    public void add(int item)
    {
        while (!first.isEmpty())
        {
            second.push(first.pop());
        }
        first.push(item);

        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
    }
    //Removing with non-efficient
    public int remove()
    {
        return first.pop();
    }
    public int peek()
    {
        return first.peek();
    }

    public boolean isEmpty()
    {
        return first.isEmpty();
    }

}
