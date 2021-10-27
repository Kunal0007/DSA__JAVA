package com.company.DSA__JAVA;

public class NumberPattern {
    public static void main(String[] args) {
        pattern1(4);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= 4; i++) {
            int col = i;
            for (int j = 1; j <= col; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
