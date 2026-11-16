package collection.stack.inbuiltExamples;

import java.util.*;

public class InBuildExample {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //Stack is a FILO and LIFO
        stack.push(10);
        stack.push(11);
        stack.push(17);
        stack.push(89);
        int size = stack.size();
        for(int i =0 ;i<size;i++)
        {
//            System.out.println(stack.pop());
        }

        //Queue example FIFO and LILO like a queue at theater
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(5);
        queue.add(6);
        queue.add(10);
        queue.add(11);
        size = queue.size();
        for(int i = 0; i<size;i++)
        {
            //Peek() will not remove the item just so use remove
//            System.out.println(queue.peek());
//            System.out.println(queue.remove());
        }

        //Dequeue insert and remove at both ends also same for removal
        Deque<Integer> deQueue = new ArrayDeque<>();
        deQueue.add(10);
        deQueue.addFirst(11);
        deQueue.addLast(5);
        System.out.println(deQueue.removeFirst());
        System.out.println(deQueue.removeLast());

    }
}
