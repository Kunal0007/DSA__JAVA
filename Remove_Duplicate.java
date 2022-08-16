package com.company.DSA__JAVA;

import java.util.Arrays;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,20,30,30,30};
        int n = remDups(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int remDups(int[] arr){
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
}
