package com.company.DSA__JAVA;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {23,56,3,78,9,25};
        int target = 25;
        System.out.println(binarysearch(arr, target));
    }

    private static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid =  start + (end  - start) / 2 ;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
