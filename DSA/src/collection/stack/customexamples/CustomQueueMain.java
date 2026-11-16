package collection.stack.customexamples;


public class CustomQueueMain {
    static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.add(10);
        queue.add(11);
        queue.add(17);
        queue.add(89);
        queue.add(12);

        queue.display();
        System.out.println(queue.remove());
        queue.display();
        
        
    }
}
