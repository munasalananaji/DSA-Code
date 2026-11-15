package collection.linkedlist;

public class MergeSortMain {
    static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(4);
        second.insertLast(14);
        second.insertLast(18);

       LL ans = LL.merge(first, second);
       ans.display();



    }
}
