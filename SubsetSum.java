package com.company.DSA__JAVA;

// Recursive Solution :::

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 5};
        int sum = 25;
        System.out.println(subsetcount(arr, sum, arr.length));
    }

    static int subsetcount(int[] arr, int sum, int n) {
        if (n == 0){
            return (sum == 0) ? 1 : 0;
        }
        return subsetcount(arr, sum, n -1) + subsetcount(arr, sum - arr[n-1], n-1);
    }
}
