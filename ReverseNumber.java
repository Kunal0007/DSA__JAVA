package com.company.DSA__JAVA;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 5;
        reverse(5);
        System.out.println();
        fun2(5);
        System.out.println();
        fun3(5);
    }

    private static void fun3(int n) {
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        fun3(n - 1);
        System.out.print(n + " ");
    }

    private static void fun2(int n) {
        if (n == 0){
            return;
        }
        fun2(n - 1);
        System.out.print(n + " ");
    }

    private static void reverse(int n) {
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        reverse(n - 1);
    }
}
