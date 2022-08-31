package com.company.DSA__JAVA;

public class MaxEvenOdd {
    public static void main(String[] args) {
        int[] arr = new int[]{10,12,8,4};
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {
        int cnt = 1;
        int ans = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i]%2 == 0 && arr[i-1]%2 == 1) || (arr[i]%2 == 1 && arr[i-1]%2 == 0)){
                cnt++;
                ans = Math.max(ans, cnt);
            }
            else {
                cnt = 1;
            }
        }
        return ans;
    }
}
