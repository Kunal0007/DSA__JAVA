package com.company.DSA__JAVA;

public class Factors {
    public static void main(String[] args) {
        int n = 36;
        factors(20);
        System.out.println();
        factors1(n);
    }

    // Time Complexity: O(N)
    private static void factors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // Time Complexity: O(sqrt(N))
    private static void factors1(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i){
                    System.out.println(i + " ");
                }
                else {
                    System.out.println(i + " " + n/i + " ");
                }
            }
        }
    }
}
