package com.company.DSA__JAVA;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = new int[]{8,5,0,10,0,20};
        movezero(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void movezero(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
//        for (int i = j; i < arr.length ; i++) {
//            arr[i] = 0;
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
