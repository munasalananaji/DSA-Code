package collection.linkedlist;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
		    node = node.next;
		}
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }



    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    //LeetCode has Cycle linked List or not

    public boolean hasCycle()
    {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!= null)
        {
            //Move fast two steps ahead
            fast = fast.next.next;
            //move 1 step ahead
            slow= slow.next;
            if(fast == slow)
            {
                return true;
            }
        }
        return false;
    }


    public int lengthCycle() {
        Node fast = head;
        Node slow = head;
        int count =0;
        while(fast!=null && fast.next!= null)
        {
            //Move fast two steps ahead
            fast = fast.next.next;
            //move 1 step ahead
            slow= slow.next;
            if(fast == slow)
            {
                slow = slow.next;
                count++;
                while(slow!=fast)
                {
                    slow = slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    //Find the element at where the cycle starts -- NOTE( do not confuse with the cycle you have created nanaji there are cycles exists in the middle of the list)
    public int elementAtNode()
    {
        Node first = head;
        Node second = head;
        int length = lengthCycle();
        System.out.println("Length in the method is "+length);
        if(length ==0)
        {
            return 0;
        }
        while(length>0)
        {
            second = second.next;
            length--;
        }
        System.out.println("This loop ends");
        while(first!=second)
        {
            first = first.next;
            second = second.next;
        }

        return first.val;

    }
}
