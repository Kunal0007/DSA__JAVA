package com.company.DSA__JAVA;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(JOP(3, 2));
    }

    static int JOP(int n, int k) {
        if (n == 1){
            return 0;
        }
        return (JOP(n-1, k) + k) % n;
    }
}
