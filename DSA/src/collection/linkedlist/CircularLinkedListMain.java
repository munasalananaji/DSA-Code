package collection.linkedlist;

public class CircularLinkedListMain {

    static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
//        list.delete(19);
        System.out.println("Is this a cycled linked list ...? "+list.hasCycle());
        System.out.println("The count of the elements in a cycled linked list is " + list.lengthCycle());
        System.out.println("The element which starts the cycle is  "+list.elementAtNode());

    }
}
