package com.company.DSA__JAVA;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int a){
        int i = 2;
        if(a <= 1){
            return false;
        }
        while (i * i < a){
            if(a % i == 0){
                return false;
            }
            i++;
        }
        return i * i > a;
    }
}
