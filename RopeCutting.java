package com.company.DSA__JAVA;

public class RopeCutting {
    public static void main(String[] args) {
        System.out.println(maxpieces(23, 11, 9, 12));
    }

    static int maxpieces(int n, int a, int b, int c) {
        if (n == 0){
            return 0;
        }
        if (n < 0){
            return -1;
        }
        int result = Math.max(Math.max(maxpieces(n-a, a, b, c), maxpieces(n-b, a, b, c)), maxpieces(n-c, a, b, c));
        if (result == -1){
            return -1;
        }
        return result + 1;
    }

}
