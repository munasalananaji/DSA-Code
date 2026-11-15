package collection.reversalLinked;

import collection.linkedlist.LL;

import javax.swing.*;

public class RotatedLinkedList {
    static void main(String[] args) {


        LL list = new LL();
        for(int i = 1; i < 7; i++) {
            list.insertLast(i);
        }
        list.display();
        list.rotatedLinkedList();
        list.display();
    }
}
