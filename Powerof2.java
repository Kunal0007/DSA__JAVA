package com.company.DSA__JAVA;

public class Powerof2 {
    public static void main(String[] args) {
        int n = 18;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
