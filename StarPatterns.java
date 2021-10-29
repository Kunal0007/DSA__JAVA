package com.company.DSA__JAVA;

public class StarPatterns {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(4);
//        pattern6(4);
        pattern7(4);
//        pattern8(4);
//        pattern9(4);
//        pattern10(4);
//        pattern11(4);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int space = 1; space <= n - i ; space++) {
               System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern8(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i > n ? 2 * n - i : i;
            int space = n - star;
            for (int j = 1; j <= space ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n) {
        for (int i = 1; i <= n ; i++) {
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int index = n - Math.min(Math.min(i, j), Math.min(2 * n - 2 - i, 2 * n - 2 - j));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}
