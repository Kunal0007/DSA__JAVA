package com.company.DSA__JAVA;

public class NewtonSqrt {
    public static void main(String[] args) {
        System.out.println(root(26));
    }

    private static double root(int i) {
        double x = i;
        double root;
        while (true){
            root = 0.5 * (x + (i/x));
            if (Math.abs(root - x) < 0.3){
                break;
            }
            x = root;
        }
        return root;
    }
}
