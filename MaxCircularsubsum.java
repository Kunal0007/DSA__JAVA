package com.company.DSA__JAVA;

public class MaxCircularsubsum {
    public static void main(String[] args) {
        int[] arr = new int[]{8,-4,3,-5,4};
//        System.out.println(solve(arr));
        System.out.println(circularmaxsum(arr));
    }

//    Time Complexity: O(n^2)

//    private static int solve(int[] arr) {
//        int res = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            int max = arr[i];
//            int sum = arr[i];
//            for (int j = 1; j < arr.length; j++) {
//                int index = (i+j)% arr.length;
//                sum += arr[index];
//                max = Math.max(sum, max);
//            }
//            res = Math.max(res , max);
//        }
//        return res;
//    }

//    Time Complexity: O(n)

    private static int normalmaxsum(int[] arr){
        int res = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max + arr[i], arr[i]);
            res = Math.max(max, res);
        }
        return res;
    }

    private static int circularmaxsum(int arr[]){
        int normalmax = normalmaxsum(arr);
        if (normalmax < 0){
            return normalmax;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = -arr[i];
        }
        int circularmax = sum + normalmaxsum(arr);
        return Math.max(normalmax, circularmax);
    }

}
