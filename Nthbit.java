package com.company.DSA__JAVA;

public class Nthbit {
    public static void main(String[] args) {
        System.out.println(findnthbit(134, 5));
    }

    private static int findnthbit(int num, int i) {
        return ((num & (1 << i-1)) >> i-1);
    }
}
