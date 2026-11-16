package collection.stack.customexamples;

public class CustomStackMain {
    static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(11);
        stack.push(17);
        stack.push(89);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
