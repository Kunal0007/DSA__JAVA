package com.company.DSA__JAVA;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {3, 13, 25, 46, 68, 72, 89, 90};
        int target = 12;
        System.out.println(floor(arr, target));
    }

//    Greatest no. less than equal to target
    static int floor(int[] arr, int target) {
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
        return end;
    }
}
