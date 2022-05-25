/*Sum of First N Natural Number*/

package com.java;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Please Enter the Number:- ");
        Scanner scan = new Scanner(System.in);
        int val1 = scan.nextInt();

        for (int i = 1; i < val1; i++) {
            sum = sum + i;
        }
        System.out.println("Addition of Natural Number:-"+" " + sum);
    }
}
