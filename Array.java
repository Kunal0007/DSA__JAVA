package com.company.DSA__JAVA;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,4,6,8};
        int[] index = new int[2];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i< 5; i++){
            for (int j = i + 1; j< 5; j++){
                if(arr[i] + arr[j] == 9){
                    index[0] = i;
                    index[1] = j;

                }
            }
        }

    }
}