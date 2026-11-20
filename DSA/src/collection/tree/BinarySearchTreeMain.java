package collection.tree;

public class BinarySearchTreeMain {
    static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = {15,10,5,12,8,20,4};
        tree.populate(nums);
        tree.display();

        System.out.println("Populating the sorted tree");
        BinarySearchTree tree1 = new BinarySearchTree();
        int[] n = {2,3,4,5,6,7,8,9,10};
        tree1.populateSorted(n);
        tree1.display();
        tree1.preOrder();
    }
}
