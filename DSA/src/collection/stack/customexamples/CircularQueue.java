package collection.stack.customexamples;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front =0;
    int size =0;

    public  CircularQueue()
    {
        this(DEFAULT_SIZE);
    }

    public  CircularQueue(int size)
    {
        this.data = new int[size];
    }

    public boolean add(int num)
    {
        if(isFull())
        {
            System.out.println("The current stack is full can't add the elements");
            return false;
        }
        data[end++] = num;
        end = end % data.length;
        size++;
        return true;
    }


    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public void display()
    {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        }while (i != end);
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }




    public boolean isEmpty() {
        return size == 0;
    }
}
