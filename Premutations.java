package com.company.DSA__JAVA;

public class Premutations {
    public static void main(String[] args) {
        String s = "ABC";
        premute(s, 0);
    }

    static void premute(String s, int i) {
        if (i == s.length() - 1){
            System.out.println(s);
            return;
        }
        for (int j = i; j < s.length(); j++) {
            s = swapchar(s, i, j);
            premute(s, i + 1);
            s = swapchar(s, j, i);
        }
    }

    static String swapchar(String s, int a, int b) {
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(a, s.charAt(b));
        sb.setCharAt(b, s.charAt(a));
        return sb.toString();
    }
}
