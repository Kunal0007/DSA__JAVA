package com.company.DSA__JAVA;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] array, int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
