package com.company.DSA__JAVA;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {3, 13, 25, 46, 68, 72, 89, 90};
        int[] arr = {90, 89, 72, 68, 46, 25, 13, 3 };
        int target = 25;
        System.out.println(orderagnosticBs(arr, target));
    }

    static int orderagnosticBs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid =  start + (end  - start) / 2 ;

            if (target == arr[mid]){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }



}
