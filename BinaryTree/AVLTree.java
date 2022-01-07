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

        return n;
    }

}
