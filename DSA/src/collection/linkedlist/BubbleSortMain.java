package collection.linkedlist;

public class BubbleSortMain {
    static void main(String[] args) {
        LL list = new LL();
        for(int i = 7 ;i>=0;i--)
        {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }
}
