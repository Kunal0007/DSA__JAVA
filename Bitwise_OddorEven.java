package com.company.DSA__JAVA;

import java.util.Scanner;

public class Bitwise_OddorEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(oddoreven(n));
    }

    private static String oddoreven(int n) {
        if ((n & 1) == 1){
            return "Odd";
        }
        return "Even";
    }
}
