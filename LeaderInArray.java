package com.company.DSA__JAVA;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 10, 4, 10, 6, 5, 2};
        int j = arr[arr.length - 1];
        System.out.print(arr[j] + " ");
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i]>j){
                j = arr[i];
                System.out.print(j + " ");
            }
        }
    }
}
