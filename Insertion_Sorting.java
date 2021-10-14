package com.company.DSA__JAVA;

import java.util.Arrays;

public class Insertion_Sorting {
    public static void main(String[] args) {
        int[] arr = {2, 6, 84, 30, -23};
        insertionsorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsorting(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

}
