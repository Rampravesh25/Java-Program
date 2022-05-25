/*Print Odd number in Given Range*/

package com.java;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number:- ");
        Scanner scan = new Scanner(System.in);
        int val1 = scan.nextInt();

        for (int i = 0; i < val1; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
