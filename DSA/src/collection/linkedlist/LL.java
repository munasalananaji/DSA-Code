package collection.linkedlist;


//NOTE go the code by the kunal explained ones for the revision part
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }


    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void unsortedmergeSort() {
       head =  mergeSortRec(head);
        display();
    }

    private Node mergeSortRec(Node localHead) {
        if(localHead==null || localHead.next==null)
        {
            return localHead;
        }

        Node mid = getMid(localHead);
        Node left = mergeSortRec(localHead);
        Node right =  mergeSortRec(mid);
        return mergeSortedList(left, right);
    }

    private Node mergeSortedList(Node list1, Node list2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;

    }

    public void bubbleSort() {
        bubbleSortRecursion(size-1, 0);
    }

    private void bubbleSortRecursion(int row, int col) {
        if(row == 0)
        {
            return;
        }

        if(col<row)
        {
            Node first = get(col);
            Node second = get(col+1);
            //case 1 first at head
            if(first == head)
            {
                head = second;
                first.next = second.next;
                second.next = first;
            } else if (second == tail) {
                Node prev = get(col-1);
                prev.next = second;
                tail = first;
                first.next = null;
                second.next = tail;

            }
            else {
                Node prev = get(col-1);
                prev.next = second;
                first.next = second.next;
                second.next= first;
            }
            bubbleSortRecursion(row, col+1);

        }
        else {
            bubbleSortRecursion(row-1, 0);
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node() {

        }
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //Merge the two linked lists
    public static LL merge(LL first, LL second)
    {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f!=null && s!=null)
        {
            if(f.value<s.value)
            {
                ans.insertLast(f.value);
                f = f.next;
            }
            else {
                ans.insertLast(s.value);
                s =s.next;
            }
        }

        while(f!= null)
        {
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!= null)
        {
            ans.insertLast(s.value);
            s =s.next;
        }
        return ans;
    }


    //FInd the middle node
    public int middleNode()
    {
        Node first = head;
        Node second = head;
        while(second!=null && second.next!=null)
        {
            first = first.next;
            second = second.next.next;
        }
        return  first.value;
    }

    public Node getMid(Node node)
    {
        Node midPrev = null;

        while (node != null && node.next != null) {

            midPrev = (midPrev == null) ? node : midPrev.next;

            node = node.next.next;
        }

        Node mid = midPrev.next;

        midPrev.next = null;

        return mid;
    }


    //Reversal of linked list --> IMP
    public void reversal(Node node)
    {
        if(node == tail)
        {
            head = tail;
            return;
        }
        reversal(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;

    }

    public Node middleNode(Node head) {
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public Node reverseList(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    public void checkPallindrone()
    {
        System.out.println("The given linked list is pallindrome "+isPalindrome(head));

    }

    public boolean isPalindrome(Node head) {
       Node mid = middleNode(head);
       Node secondHead = reverseList(mid);
       Node reReverseHead = secondHead;

       while (head!=null && secondHead!=null)
       {
           if(head.value != secondHead.value)
           {
               break;
           }
           head = head.next;
           secondHead = secondHead.next;
       }
       reverseList(reReverseHead);
       return  head==null || secondHead==null;
    }
    //Reversal of linked list in place v.v.imp (asked in google amazon, apple)
    public void reverseList()
    {
        // We will be taking three pointers to traverse
       Node prev   = null;
       Node present = head;
       Node next =  present.next;
       while(present!=null)
       {
           present.next = prev;
           prev = present;
           present = next;
           if(next!=null)
           {
               next = next.next;
           }

       }
       head = prev;
    }


    // Google, Microsoft, Facebook: https://leetcode.com/problems/reverse-linked-list-ii/
    public Node reverseBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;

        // reverse between left and right
        Node next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }

    public void reOrderList()
    {
        reOrderListFun(head);
    }

    //Reordering the list
    private void reOrderListFun(Node head) {
        if(head ==null || head.next==null)
        {
            return;
        }
        Node mid = middleNode(head);
        Node headFirst = head;
        Node headSecond = reverseList(mid);

        while(headFirst!= null && headSecond!= null)
        {
            Node temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        if(headFirst!=null)
        {
            headFirst.next = null;
        }

    }

    // google, amazon, facebook, microsoft: https://leetcode.com/problems/reverse-nodes-in-k-group/
    public Node reverseKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        Node current = head;
        Node prev = null;

        int length = getLength(head);
        int count = length / k;
        while (count > 0) {
            Node last = prev;
            Node newEnd = current;

            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            prev = newEnd;
            count--;
        }
        return head;
    }

    public int getLength(Node head) {
        Node node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }


    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public Node reverseAlternateKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        // skip the first left-1 nodes
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node last = prev;
            Node newEnd = current;

            // reverse between left and right
            Node next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = current;

            // skip the k nodes
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }


    public void rotatedLinkedList()
    {
      head =   rotatedLinkedListFun(head, 2);

    }
    public Node rotateRight(Node head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        Node last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

    private Node rotatedLinkedListFun(Node head, int k) {
        if(k<=0 &&head == null && head.next ==null)
        {
            return  head;
        }
        Node last = head;
        int length = 1;
        while(last.next !=null)
        {
            last = last.next;
            length++;
        }
        last.next = head;
        //Check the rotation concept in video
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;
        for(int i =0; i<skip-1; i++)
        {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;

    }

}
