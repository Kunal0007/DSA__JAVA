package com.company.DSA__JAVA;

public class Countzeros {
    public static void main(String[] args) {
        System.out.println(countzeros(304050, 0));
    }

    private static int countzeros(int n, int count) {
        if (n == 0){
            return count;
        }
        if (n % 10 == 0){
            return countzeros(n / 10, count+1);
        }
        return countzeros(n / 10, count);
    }
}
