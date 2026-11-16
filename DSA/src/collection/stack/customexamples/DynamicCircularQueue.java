package collection.stack.customexamples;

public class DynamicCircularQueue  extends CircularQueue{

    public DynamicCircularQueue()
    {
        super();
    }
    public DynamicCircularQueue(int size)
    {
        super(size);
    }


    @Override
    public boolean add(int num) {
        if(isFull())
        {
            int[] newArray = new int[data.length*2];
            for(int i =0; i<data.length;i++)
            {
                //Since we have to start from front as end rotates at the removed elements
                newArray[i] = data[(front+i)% data.length];
            }
            // as started copying the elements from the front make the front 0
            front=0;
            //from the 0 start adding the elements again in the new array
            end = data.length;
            data = newArray;
        }
        return super.add(num);
    }
}
