package collection.linkedlist;

public class UnSortedMergeSortMain {
    static void main(String[] args) {
        LL  list = new LL();
        list.insertLast(4);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(3);
        list.unsortedmergeSort();
        list.display();
    }

}
