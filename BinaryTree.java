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

    void traversalInorder(Node root){
        if (root == null){
           return;
        }

        traversalInorder(root.left);
        System.out.print(root.value + "-");
        traversalInorder(root.right);

    }

    void traversalPostorder(Node root){
        if (root == null){
            return;
        }

        traversalPostorder(root.left);

        traversalPostorder(root.right);

        System.out.print(root.value + "-");

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(4);

        tree.traversalInorder(tree.root);
        System.out.println();
        tree.traversalPostorder(tree.root);
    }

}
