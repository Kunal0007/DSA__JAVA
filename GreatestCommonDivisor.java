package com.company.DSA__JAVA;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(2, 8));
    }

    private static int gcd(int a, int b) {
        if (a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}
