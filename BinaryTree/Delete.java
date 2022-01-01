package com.company.DSA__JAVA.BinaryTree;

public class Delete {
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

        tree.traversalInorder(root);

        int key = 50;
        delete(root, key);

        System.out.println();

        tree.traversalInorder(root);
    }

    private static Node delete(Node root, int key) {
        if (root == null){
            return root;
        }

        if (key < root.value){
            root.left = delete(root.left, key);
        }
        else if (key > root.value){
            root.right = delete(root.right, key);
        }
        else {
            // No child or one child
            if (root.left == null && root.right == null){
                root = null;
            }
            // One child
            else if (root.left == null){
                root = root.right;
            }
            else if (root.right == null){
                root = root.left;
            }
            else {
                root.value = minValue(root.right);
                root.right = delete(root.right, root.value);
            }
        }
        return root;
    }

    private static int minValue(Node root) {
        int min = root.value;
        while (root.left != null){
            min = root.left.value;
            root = root.left;
        }
        return min;
    }

}
