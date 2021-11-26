package com.company.DSA__JAVA;

public class FactorialR {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialR(n));
    }

    private static int factorialR(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorialR(n - 1);
    }
}
