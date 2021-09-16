package com.company.DSA__JAVA;

import java.util.Arrays;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,25,3,48,8};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] array, int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
