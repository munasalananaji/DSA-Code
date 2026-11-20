package collection.tree;

public class BinarySearchTree {

    private Node root;

    public static class Node
    {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value)
        {
            this.value = value;
        }

        public int getValue()
        {
            return this.value;
        }
    }

    public boolean isEmpty()
    {
        return root ==null;
    }

    public int height(Node node)
    {
        if(node == null)
        {
           return -1;
        }
        return node.height;
    }

    public void insert(int value)
    {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if(node==null)
        {
         node = new Node(value);
         return node;
        }

        if(value<node.value)
        {
           node.left = insert(node.left, value);
        }

        if(value>node.value)
        {
           node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left) , height(node.right))+1;
        return node;
    }




    public boolean isBalanced()
    {
       return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if(node==null)
        {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display()
    {
        display(root, "Root Node is :");
    }

    public void populate(int[] nums)
    {
        for(int i =0; i<nums.length ;i++)
        {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums)
    {
       populateSorted(nums, 0, nums.length-1);
    }

    private void populateSorted(int[] nums, int start, int end) {

        if(start>=end)
        {
            return ;
        }
        int mid = (start+end)/2;
        insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

    private void display(Node node, String details) {
        if(node==null)
        {
            return;
        }
        System.out.println(details+node.value);
        display(node.left, "The left of the node "+node.value+" : ");
        display(node.right, "The right of the node "+node.value+" : ");
    }

    //Pre Order  Node  -> Left -> right
    public void preOrder()
    {
        preOrder(root);
    }

    private void preOrder(Node node)
    {
        if(node ==null)
        {
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Pre Order  Left  -> Node -> right
    public void inorder()
    {
        inorder(root);
    }

    private void inorder(Node node)
    {
        if(node ==null)
        {
            return;
        }
        preOrder(node.left);
        System.out.print(node.value+" ");
        preOrder(node.right);
    }

    //Post Order  LEFT  -> RIGHT -> NODE
    public void postorder()
    {
        postorder(root);
    }

    private void postorder(Node node)
    {
        if(node ==null)
        {
            return;
        }
        preOrder(node.left);

        preOrder(node.right);
        System.out.print(node.value+" ");
    }
}
