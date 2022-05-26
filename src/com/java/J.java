/*Print Character Input from User*/

package com.java;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please inter the Character:-");
        Scanner scan = new Scanner(System.in);
       /* Why next() {this is Scanner method used for taking input as string} and
        charAt{input except at char} are used
       because while taking char
       input we have to use char at and by using next method of sting*/
        ch = scan.next().charAt(0);
        System.out.println(" This is Output: " + "  " + ch);

    }
}
