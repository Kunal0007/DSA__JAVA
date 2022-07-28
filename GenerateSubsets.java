package com.company.DSA__JAVA;

public class GenerateSubsets {
    public static void main(String[] args) {
        String s = "ABC";
        subsets(s, "", 0);
    }

//    ABC --> A B C AB AC BC ABC

    static void subsets(String s, String curr, int i) {
        if (i == s.length()){
            System.out.println(curr);
            return;
        }
        subsets(s, curr, i+1);
        subsets(s, curr + s.charAt(i), i+1);
    }
}
