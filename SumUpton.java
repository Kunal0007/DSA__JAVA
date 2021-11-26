package com.company.DSA__JAVA;

public class SumUpton {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(SumR(n));
    }

    private static int SumR(int n) {
        if (n == 1){
            return 1;
        }

        return n + SumR(n - 1);
    }
}
