package com.company.DSA__JAVA;

public class PowerofNumber {
    public static void main(String[] args) {
        int base = 4;
        int power = 3;

        int ans = 1;
        while (power > 0){
            if ((power & 1) == 1){
               ans *= base;
            }
            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }
}
