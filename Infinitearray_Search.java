package com.company.DSA__JAVA;

public class Infinitearray_Search {
    public static void main(String[] args) {
        int[] arr = {3, 13, 25, 46, 68, 72, 89, 90};
        int target = 72;
        System.out.println(Ans(arr, target));
    }

    static int Ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int temp = end +1;
            end = end + (end - start + 1) * 2 ;
            start = temp;
        }

       return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end){
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
