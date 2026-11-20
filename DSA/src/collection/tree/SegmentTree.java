package collection.tree;

public class SegmentTree {

    public static  void main(String[] args)
    {
        int[] arr = {2,4,8,-1,-2,9};
        SegmentTree tree = new SegmentTree(arr);
        System.out.println("The Whole sum of the digits are "+tree.wholeSum());
        System.out.println("**********************");
//        tree.display();
        System.out.println("The sum of the digits ina 1-2 is "+tree.onQuery(1,2));
        System.out.println("Update the 3rd index with -1 with 3 "+tree.update(3,1));


    }

    private Node root;

    public static class Node
    {
        int data;
        int start;
        int end;
        Node left;
        Node right;
        public Node(int start, int end)
        {
            this.start = start;
            this.end = end;
        }
    }

   public SegmentTree(int[] arr)
   {
       root = constructTree(arr, 0, arr.length-1);
   }

    private Node constructTree(int[]  arr, int start, int end) {
        if(start==end)
        {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start+end)/2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);
        node.data = node.left.data+node.right.data;
        return node;
    }


    public void display()
    {
        display(root);
    }

    private void display(Node node) {

        if(node.left!=null)
        {
            System.out.println("The element data at left is "+node.left.data+" [ "+node.left.start+" - "+ node.left.end +" ]");
        }
        else {
            System.out.println("Left node is empty");
        }

        System.out.println("The element data is "+node.data+" [ "+node.start+" - "+node.end+" ]");
        if(node.right!=null)
        {
            System.out.println("The element data at right is "+node.right.data+" [ "+node.right.start+" - "+ node.right.end +" ]");
        }
        else {
            System.out.println("right node is empty");
        }
        if(node.left!=null)
        {
            display(node.left);
        }
        if(node.right!=null)
        {
            display(node.right);

        }
    }
    public int wholeSum()
    {
        return root.data;
    }

    public int onQuery(int si, int ei)
    {
        return query(root, si, ei);
    }

    private int query(Node node, int si, int ei) {

        //Completely inside
        if(node.start>=si && node.end<=ei)
        {
            return node.data;
        } else if (node.start>ei || node.end< si) {
            return 0;
        }
        else {
            return query(node.left, si, ei) + query(node.right,si,ei);

        }

    }

    public int update(int index, int value)
    {
        return update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if(index>=node.start && index<=node.end)
        {
            if(node.start ==index && node.end ==index)
            {
                node.data = value;
                return node.data;
            }
            else {
               return node.data = update(node.left, index, value)+update(node.right, index, value);
            }
        }
        return node.data;
    }
}
