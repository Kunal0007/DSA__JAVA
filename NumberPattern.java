package com.company.DSA__JAVA;

public class NumberPattern {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(5);
//        pattern6(4);
        pattern7(4);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            int col = i;
            for (int j = 1; j <= col; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
               int col = fac(i - 1)/ (fac(j) * fac(i - 1 - j));
               System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static int fac(int n){
        if (n == 0){
            return 1;
        }
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }

        return fac;
    }

    static void pattern3(int n) {
        for (int i = 1; i <= 2 * n - 1 ; i++) {
            int col = i > n ? 2 * n - i : i;
            int space = n - col;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = col; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= col; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        int col = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(col + j + "  ");
            }
            col += i + 1;
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int index = n - Math.min(Math.min(i, j), Math.min(2 * n - 2 - i, 2 * n - 2 - j));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
    
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1 ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
