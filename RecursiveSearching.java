package com.company.DSA__JAVA;

import java.util.ArrayList;

public class RecursiveSearching {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,12};
        System.out.println(search(arr, 10, 0));
        System.out.println(searchIndex(arr, 8, 0));
        int[] arr1 = {2,5,1,8,8,12};
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(searchAllIndex(arr1, 8, 0, ans));
    }

    private static ArrayList<Integer> searchAllIndex(int[] arr, int target, int i, ArrayList<Integer> ans) {
        if (i == arr.length){
            return ans;
        }
        if (arr[i] == target){
            ans.add(i);
        }
        return searchAllIndex(arr, target, i + 1, ans);
    }

    private static int searchIndex(int[] arr, int target, int i) {
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return searchIndex(arr, target, i + 1);
    }

    private static boolean search(int[] arr, int target, int i) {
        if (i == arr.length){
            return false;
        }
        if (arr[i] == target){
            return true;
        }
        return search(arr, target, i + 1);
    }
}
