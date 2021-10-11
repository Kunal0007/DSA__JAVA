package com.company.DSA__JAVA;

import java.util.Arrays;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6}; //{3, 6, 2, 9, 12, 8}
        bubblesorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesorting(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if (!swapped){
                break;
            }
        }
    }
}
