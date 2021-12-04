package com.company.DSA__JAVA;

import java.util.Arrays;

public class QuickSorting {
    public static void main(String[] args) {
        int[] arr = {21,12,1,5,8,9,3};
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end){
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }

            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quicksort(arr, low, end);
        quicksort(arr, start, high);

    }

}
