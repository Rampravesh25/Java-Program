/*Check Character Vowels or consonants in java*/

package com.java;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please inter the Character:-");
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowels");
        }else {
            System.out.println("Consonant");
        }
    }
}
