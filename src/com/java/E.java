// Sum of Two Number Taking Input

package com.java;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number:- ");
        Scanner scan = new Scanner(System.in);
        int val1 = scan.nextInt();
        int val2 = scan.nextInt();

        int sum = val1 + val2;
        System.out.println("Addition of Two Number:-" + " " + sum);
    }
}
