package collection.tree;

public class AVLMain {
    public static void main(String[] args) {
        BinarySearchTreeAVL tree = new BinarySearchTreeAVL();

        for(int i=0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }
}
