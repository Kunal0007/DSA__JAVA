package com.company.DSA__JAVA;

public class Count1s {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,1,1};
        System.out.println(maxCon(arr));
    }

    private static int maxCon(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }
            else {
                count = 0;
            }
        }
        return max;
    }
}
