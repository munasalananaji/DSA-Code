package collection.stack.customexamples;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pointer = -1;

    public  CustomStack()
    {
        this(DEFAULT_SIZE);
    }

    public  CustomStack(int size)
    {
        this.data = new int[size];
    }

    public boolean push(int num)
    {

        if(isFull())
        {
            System.out.println("The current stack is full can't add the elements");
            return false;
        }
        pointer++;
        data[pointer] = num;
        return true;

    }

    public boolean isFull() {
        return pointer == data.length-1;
    }

    public int pop() throws StackException {
        if(isEmpty())
        {
          throw new StackException("Stack is empty");
        }
        return data[pointer--];
    }

    public int peek() throws StackException {
        if(isEmpty())
        {
            throw new StackException("Stack is empty");
        }
        return data[pointer];
    }

    public boolean isEmpty() {
        return pointer ==-1;
    }


}
