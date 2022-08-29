package com.company.DSA__JAVA;

public class Maxsubsum {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,-8,7,-1,2,3};
        System.out.println(maxsum(arr));
    }

    private static int maxsum(int[] arr) {
        int res = arr[0];
        int maxEnd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }
}
