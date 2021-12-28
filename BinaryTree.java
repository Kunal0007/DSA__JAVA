package com.company.DSA__JAVA;

class Node {
    int value;
    Node left, right;

    public Node(int value){
        this.value = value;
        this.left = this.right = null;
    }
}

public class BinaryTree {

    Node root;

    public BinaryTree(){
        root = null;
    }

    void traversalInorder(Node root){   // 4 2 5 1 7 3
        if (root == null){
           return;
        }

        traversalInorder(root.left);
        System.out.print(root.value + "-");
        traversalInorder(root.right);

    }

    void traversalPostorder(Node root){    // 4 5 2 7 3 1
        if (root == null){
            return;
        }

        traversalPostorder(root.left);

        traversalPostorder(root.right);

        System.out.print(root.value + "-");

    }

    void traversalPreorder(Node root){    // 1 2 4 5 3 7
        if (root == null){
            return;
        }

        System.out.print(root.value + "-");

        traversalPreorder(root.left);

        traversalPreorder(root.right);

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(7);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);

        tree.traversalInorder(tree.root);
        System.out.println();
        tree.traversalPostorder(tree.root);
        System.out.println();
        tree.traversalPreorder(tree.root);
    }

}
