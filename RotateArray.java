package com.company.DSA__JAVA;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = in.nextInt();
        }

        for (int j = 0; j < r; j++) {
            rotate(arr);
        }

        for (int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println("");
    }

    private static void rotate(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

    }
}
