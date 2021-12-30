package com.company.DSA__JAVA.BinaryTree;

public class Insertion {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = insertion(tree.root, 100);
        insertion(root, 50);
        insertion(root, 120);
        insertion(root, 45);
        insertion(root, 27);
        insertion(root, 15);
        tree.traversalInorder(root);
    }

    private static Node insertion(Node root, int value) {
        if (root == null){
            root = new Node(value);
            return root;
        }
        if (value < root.value){
            root.left = insertion(root.left, value);
        }
        else {
            root.right = insertion(root.right, value);
        }
        return root;
    }

}
