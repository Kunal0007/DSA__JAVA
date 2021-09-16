package com.company.DSA__JAVA;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

//        for(int i = 0; i<arr.length; i++){
//            for(int j = 0; j<arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int i = 0; i<arr.length; i++){
//            System.out.print(Arrays.toString(arr[i]));
//            System.out.println();
//        }

        for (int[] ints : arr) {
            System.out.print(Arrays.toString(ints));
            System.out.println();
        }
    }
}
