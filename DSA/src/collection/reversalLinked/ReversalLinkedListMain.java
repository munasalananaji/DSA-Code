package collection.reversalLinked;

import collection.linkedlist.LL;

public class ReversalLinkedListMain {
    static void main(String[] args) {
        LL list = new LL();
        for(int i =7 ; i>=0;i--)
        {
            list.insertLast(i);
        }
        list.display();
        list.reverseList();
        System.out.println("The reversal of list is ");
        list.display();
    }
}
