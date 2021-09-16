package com.company.DSA__JAVA;

public class Max_number {
    public static void main(String[] args) {
        int[] arr = {1,7,45,6,9,23};
        System.out.println(max(arr));
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
}
