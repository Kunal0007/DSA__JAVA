package com.company.DSA__JAVA;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
        for(int i = 100; i<1000; i++){
            if(isArmstr(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstr(int n){
        int sum = 0;
        int orignal = n;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n /10;
        }
        return orignal == sum;
    }
}
