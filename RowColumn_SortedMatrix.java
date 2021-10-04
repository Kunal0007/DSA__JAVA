package com.company.DSA__JAVA;

import java.util.Arrays;

public class RowColumn_SortedMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {7, 12, 16, 20},
                {9, 13, 19, 32},
                {15, 18, 25, 35}
        };

        System.out.println(Arrays.toString(matrixSearch(arr, 19)));

    }

    static int[] matrixSearch(int[][] arr, int target){

        int row = 0;
        int column = arr[0].length - 1;

        while (column >= 0 && row < arr.length){
            if (arr[row][column] == target){
                return new int[]{row, column};
            }
            if (arr[row][column] > target){
                column--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1, -1};
    }

}
