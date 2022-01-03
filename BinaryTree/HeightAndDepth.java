package com.company.DSA__JAVA.BinaryTree;

public class HeightAndDepth {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = Insertion.insertion(tree.root, 100);
        Insertion.insertion(root, 50);
        Insertion.insertion(root, 120);
        Insertion.insertion(root, 45);
        Insertion.insertion(root, 27);
        Insertion.insertion(root, 15);
        Insertion.insertion(root, 48);
        Insertion.insertion(root, 46);
        Insertion.insertion(root, 110);
        Insertion.insertion(root, 128);

        tree.traversalInorder(root);

        System.out.println();

        System.out.println(height(root));

    }

    private static int height(Node root) {
        if (root == null){
            return -1;
        }
        else {
            int lheight = height(root.left);
            int rheight = height(root.right);


            return 1 + Math.max(lheight, rheight);
        }
    }
}
