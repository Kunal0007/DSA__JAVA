package com.company.DSA__JAVA;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(stringSearch(name, target));
    }

    private static boolean stringSearch(String name, char target) {
        if (name.length() == 0){
            return false;
        }

//        for (int i = 0; i < name.length(); i++) {
//            if (target == name.charAt(i)){
//                return true;
//            }
//        }

        for (char a: name.toCharArray()) {
            if (target == a){
               return true;
            }
        }

        return false;
    }
}
