package com.company.DSA__JAVA;

public class MaximunDiff {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,10,11,4,8,1};
        System.out.println(maxdiff(arr));
    }

    private static int maxdiff(int[] arr) {
        int diff = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                diff = Math.max(diff, arr[j] - arr[i]);
            }
        }
        return diff;
    }
}
