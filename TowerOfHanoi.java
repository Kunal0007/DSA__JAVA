package com.company.DSA__JAVA;

public class TowerOfHanoi {
    public static void main(String[] args) {
        TOH(3, 'A', 'B', 'C');
    }

    static void TOH(int n, char a, char b, char c) {
        if (n == 1){
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }
        TOH(n-1, a, c, b);
        System.out.println("Move " + n + " from " + a + " to " + c);
        TOH(n-1, b, a, c);
    }
}
