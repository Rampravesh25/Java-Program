/*Print Character Input from User*/

package com.java;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        char ch;
        System.out.println("Please inter the Character:-");
        Scanner scan = new Scanner(System.in);
       /* Why next and charAt are used becuase while taking char
       input we have to use char at and by using next method of sting*/
        ch = scan.next().charAt(0);
        System.out.println(" This is Output: " + "  " + ch);

    }
}
