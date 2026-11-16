package collection.stack.customexamples;

public class DynamicStackMain {
    static void main(String[] args) throws StackException {
        //Now passing teh Dynamic Stack object
        CustomStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(11);
        stack.push(17);
        stack.push(89);
        stack.push(12);
        stack.push(78);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
