package com.company.DSA__JAVA;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {23,56,3,78,9,25};
        int target = 30;
        System.out.println(linearsearch(arr, target));
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
