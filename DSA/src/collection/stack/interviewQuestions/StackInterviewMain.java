package collection.stack.interviewQuestions;

public class StackInterviewMain {
    static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        //We have created the Queue with returning the FIFO
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println("*********************Efficient remoove impl***********************");
        QueueUsingStackEfficientremove queueEff = new QueueUsingStackEfficientremove();
        queueEff.add(1);
        queueEff.add(2);
        queueEff.add(3);
        queueEff.add(4);

        System.out.println("pop the element "+queueEff.remove());
        System.out.println("Peek the elemet "+queueEff.peek());

    }
}
