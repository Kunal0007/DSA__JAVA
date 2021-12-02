package com.company.DSA__JAVA;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = {5,6,2,4,19,11,12,12};
        arr = mergesorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergesorting(int[] arr) {
        if (arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesorting(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesorting(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                merged[k] = first[i];
                i++;
            }
            else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }

        return merged;
    }

}
