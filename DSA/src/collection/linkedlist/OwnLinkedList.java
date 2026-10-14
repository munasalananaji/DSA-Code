package collection.linkedlist;

public class OwnLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public OwnLinkedList()
    {
        this.size=0;
    }

    public void insert(int value, int index)
    {
        if(index==0)
        {
            insertFirst(value);
        } else if (index == size) {
            insertLast(value);
        }
        else {
            Node temp =head;
            for(int i =1; i<index;i++)
            {
                temp = temp.next;
            }
            Node node = new Node(value, temp.next);
            temp.next= node;
        }size++;
    }
    //Delete first element
    public int deleteFirst()
    {
        int val = head.value;
        head = head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val;

    }

    //Delete Last element

    public int deleteLast()
    {

        if(size<=1)
        {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next= null;
        size--;
        return val;
    }

    private Node get(int index)
    {
        Node temp = head;

        for(int i =0; i<index;i++)
        {
            temp = temp.next;
        }
        return temp;
    }


    //Insert Element at last
    public void insertLast(int value)
    {
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
    }


    public void insertFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size++;
    }


    private class Node
    {
     private int value;
     private Node next;
     public Node(int value)
     {
         this.value = value;
     }
     public Node(int value, Node next)
     {
         this.value = value;
         this.next = next;
     }
    }
}
