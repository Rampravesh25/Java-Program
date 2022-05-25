//Odd Even Number checking While giving Input

package com.java;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number:- ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("This is Even Number");
        } else {
            System.out.println("This is Odd Number");
        }
    }
}
