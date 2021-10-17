package com.company.DSA__JAVA;

import java.util.Arrays;

public class Cyclic_Sorting {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 3};
        cyclicsorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicsorting(int[] arr){
        int i = 0;
        while(i < arr.length){
            int crt = arr[i] - 1;
            if(arr[i] != arr[crt]){
                int temp = arr[i];
                arr[i] = arr[crt];
                arr[crt] = temp;
            }
            else{
                i++;
            }
        }
    }

}
