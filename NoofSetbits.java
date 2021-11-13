package com.company.DSA__JAVA;

public class NoofSetbits {
    public static void main(String[] args) {
        int n = 13235;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
//      Solution 1 :

//        int count1 = 0;
//
//        while (n > 0){
//            if ((n & 1) == 1){
//                count1++;
//            }
//            n = n >> 1;
//        }
//
//        return count1

//      Solution 2:

        int count2 = 0;

        while (n > 0){
            count2++;
            n = n & (n-1);
        }

        return count2;
    }
}
