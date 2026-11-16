package collection.stack.customexamples;

public class DynamicStack extends CustomStack {

    public DynamicStack()
    {
        super();
    }
    public DynamicStack(int size)
    {
        super(size);
    }

    @Override
    public boolean push(int num) {
        if(isFull())
        {
            int[] dynamicArray = new int[data.length*2];
            for(int i =0 ;i<data.length; i++)
            {
                //copy the elements from the previous array
                dynamicArray[i] = data[i];
            }
            data = dynamicArray;

        }
        //If it's not full then add the elements to the array
        return super.push(num);
    }
}
