package com.company.DSA__JAVA;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {78,7,-45,6,9,23};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < result){
                result = arr[i];
            }
        }
        return result ;
    }
}
