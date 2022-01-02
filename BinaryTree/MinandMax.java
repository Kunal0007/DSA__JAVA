package com.company.DSA__JAVA.BinaryTree;

public class MinandMax {
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

        System.out.println(minValue(root));

        System.out.println(maxValue(root));

        tree.traversalInorder(root);
    }

    private static int maxValue(Node root) {
        if (root == null){
            System.out.println("Error: Tree is empty");
            return -1;
        }
        int max = root.value;
        if (root.right != null){
            max = maxValue(root.right);
        }
        return max;
    }

    private static int minValue(Node root) {
        if (root == null) {
            System.out.println("Error: Tree is empty");
            return -1;
        }
        int min = root.value;
        if (root.left != null) {
            min = minValue(root.left);
        }
        return min;
    }
}
