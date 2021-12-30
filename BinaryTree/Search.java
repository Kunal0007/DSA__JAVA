package com.company.DSA__JAVA.BinaryTree;

public class Search {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = Insertion.insertion(tree.root, 100);
        Insertion.insertion(root, 50);
        Insertion.insertion(root, 120);
        Insertion.insertion(root, 45);
        Insertion.insertion(root, 27);
        Insertion.insertion(root, 15);

        int key = 15;
        if (search(root, key) != null){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }

    private static Node search(Node root, int key) {
        if (root==null || root.value == key){
            return root;
        }
        if (key < root.value){
            return search(root.left, key);
        }
        return search(root.right, key);
    }
}
