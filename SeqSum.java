package com.company.DSA__JAVA;

import java.util.*;

public class SeqSum {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = {1, 1, 2};
        int sum = 2;
        ArrayList<Integer> seq = new ArrayList<Integer>();
//        printS(0, arr, seq, sum, 0);
//        printOneS(0, arr, seq, sum, 0);
        System.out.println(printCountS(0, arr, sum, 0));
    }

    public static void printS(int i, int[] arr, ArrayList<Integer> seq, int sum, int s) {
        if(i == arr.length){
            if (s == sum){
                System.out.println(seq);
            }
            return;
        }
        seq.add(arr[i]);
        s = s + arr[i];
        printS(i + 1, arr, seq, sum, s);

        s = s - arr[i];
        seq.remove(seq.size() - 1);
        printS(i + 1, arr, seq, sum, s);
    }

    public static boolean printOneS(int i, int[] arr, ArrayList<Integer> seq, int sum, int s) {
        if(i == arr.length){
            if (s == sum){
                System.out.println(seq);
                return true;
            }
            return false;
        }
        seq.add(arr[i]);
        s = s + arr[i];
        if (printOneS(i + 1, arr, seq, sum, s)){
            return true;
        };

        s = s - arr[i];
        seq.remove(seq.size() - 1);
        if (printOneS(i + 1, arr, seq, sum, s)){
            return true;
        };

        return false;
    }

    public static int printCountS(int i, int[] arr, int sum, int s) {
        if(i == arr.length){
            if (s == sum){
                return 1;
            }
            return 0;
        }
        s = s + arr[i];
        int l = printCountS(i + 1, arr, sum, s);

        s = s - arr[i];
        int r = printCountS(i + 1, arr, sum, s);

        return l + r;
    }

}
