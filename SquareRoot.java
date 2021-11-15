package com.company.DSA__JAVA;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 26;
        int pre = 3;
        System.out.printf("%.3f", squareroot(n, pre));
    }

    private static double squareroot(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;
        while (start <= end){
            int mid = start + (end - start)/2;
            if (mid * mid == n){
                return mid;
            }
            if (mid * mid > n){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
//        root = start;
        double incre = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incre;
            }
            root -= incre;
            incre = incre/10;
        }
        return root;
    }
}
