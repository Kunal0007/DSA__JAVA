package com.company.DSA__JAVA.BinaryTree;

class NodeAvl {
    int value, height;
    NodeAvl left, right;

    NodeAvl(int n){
        value = n;
        height = 1;
    }
}

public class AVLTree {
    NodeAvl root;

    int height(NodeAvl n){
        if (n == null){
            return 0;
        }

        return n.height;
    }

    NodeAvl rightRotate(NodeAvl n){
        NodeAvl n1 = n.left;
        NodeAvl n2 = n1.right;

        n1.right = n;
        n.left = n2;

        n.height = Math.max(height(n.left), height(n.right)) + 1;
        n1.height = Math.max(height(n1.left), height(n1.right)) + 1;

        return n1;
    }

    NodeAvl leftRotate(NodeAvl n){
        NodeAvl n1 = n.right;
        NodeAvl n2 = n1.left;

        n1.left = n;
        n.right = n2;

        n.height = Math.max(height(n.left), height(n.right)) + 1;
        n1.height = Math.max(height(n1.left), height(n1.right)) + 1;

        return n1;
    }

    int getBalance(NodeAvl n){
        if (n == null){
            return 0;
        }

        return height(n.left) - height(n.right);
    }

    NodeAvl insert(NodeAvl root, int key){
        if (root == null){
            return new NodeAvl(key);
        }

        if (key < root.value){
            root.left = insert(root.left, key);
        }
        else if (key > root.value){
            root.right = insert(root.right, key);
        }
        else {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

//      LL
        if (balance > 1 && key < root.left.value){
            return rightRotate(root);
        }

//      RR
        if (balance < -1 && key > root.right.value){
            return leftRotate(root);
        }

//      LR
        if (balance > 1 && key > root.left.value){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

//      RL
        if (balance < -1 && key < root.right.value){
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    void traversalInorder(NodeAvl root){
        if (root == null){
            return;
        }

        traversalInorder(root.left);
        System.out.print(root.value + "-");
        traversalInorder(root.right);

    }

    void traversalPreorder(NodeAvl root){
        if (root == null){
            return;
        }

        System.out.print(root.value + "-");

        traversalPreorder(root.left);

        traversalPreorder(root.right);

    }


    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        NodeAvl root = tree.insert(tree.root, 100);
        root = tree.insert(root, 95);
        root = tree.insert(root, 97);
        root = tree.insert(root, 110);
        root = tree.insert(root, 87);
        root = tree.insert(root, 86);

        tree.traversalInorder(root);
    }


}
