package collection.linkedlist;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        OwnLinkedList list = new OwnLinkedList();
        list.insertFirst(10);
        list.insertFirst(1);
        list.insertFirst(7);

        list.insertLast(78);
        list.insertLast(12);
        list.insert(2, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println();
        System.out.println(list.deleteLast());
        list.display();
        //again delete
        System.out.println();
        System.out.println(list.deleteLast());
        list.display();




    }
}
