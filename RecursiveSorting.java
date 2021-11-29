package com.company.DSA__JAVA;

import java.util.Arrays;

public class RecursiveSorting {
    public static void main(String[] args) {
        int[] arr = {1,3,9,4,2,6};
//        System.out.println(sorted(arr, 0));
//        bubble(arr, arr.length - 1, 0);
//        System.out.println(Arrays.toString(arr));
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr, int r, int c, int max) {
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[max]){
                selection(arr, r, c + 1, c);
            }
            else {
                selection(arr, r, c + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }

    private static void bubble(int[] arr, int r, int c) {
        if (r == 0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[c + 1]){
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);
        }
        bubble(arr, r - 1, 0);
    }

    private static boolean sorted(int[] arr, int i) {
        if (i == arr.length - 1){
            return true;
        }
        return arr[i] < arr[i + 1] && sorted(arr, i + 1);
    }
}
