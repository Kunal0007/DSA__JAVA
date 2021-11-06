package com.company.DSA__JAVA;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 4, 4, 7, 1};
        System.out.println(uniqueno(arr));
    }

    private static int uniqueno(int[] arr) {
        int ans = 0;
        for (int j : arr) {
            ans ^= j;
        }
        return ans;
    }
}
