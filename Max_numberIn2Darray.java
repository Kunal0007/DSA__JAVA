package com.company.DSA__JAVA;

import java.util.Arrays;

public class Max_numberIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,56,4},
                {5,73,7,8},
                {7,9,12}
        };
        int ans = max(arr);
        System.out.println(ans);
    }

    private static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
