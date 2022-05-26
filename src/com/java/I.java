/*Print  Even in Given Range*/

package com.java;

import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number:- ");
        Scanner scan = new Scanner(System.in);
        int val1 = scan.nextInt();

        for (int i = 2; i <= val1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}


