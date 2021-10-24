package com.company.DSA__JAVA;

import java.util.Locale;
import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        String word;
        Scanner in = new Scanner(System.in);
        word = in.next();
        System.out.println(palindrome(word));
    }

    static boolean palindrome(String word) {
        if (word == null || word.length() == 0){
            return true;
        }

        word = word.toLowerCase();
        for (int i = 0; i <= word.length()/2; i++) {
            char start = word.charAt(i);
            char end = word.charAt(word.length() - 1 - i);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
