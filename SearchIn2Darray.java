package com.company.DSA__JAVA;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,56,4},
                {5,43,7,8},
                {7,9,12}
        };
        int target = 12;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
