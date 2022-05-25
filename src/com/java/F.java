/*Print First N Natural Number Program*/

package com.java;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number:- ");
        Scanner scan = new Scanner(System.in);
        int val1 = scan.nextInt();

        for (int i = 1; i <val1 ; i++) {
            System.out.println(i);
        }
    }
}
