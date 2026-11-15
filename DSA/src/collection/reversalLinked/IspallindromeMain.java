package collection.reversalLinked;

import collection.linkedlist.LL;

public class IspallindromeMain {
    static void main(String[] args) {
        LL list = new LL();
        list.insertLast(7);
        list.insertLast(2);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(7);
        list.checkPallindrone();
        list.display();

    }
}
