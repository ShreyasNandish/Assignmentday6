package com.bridgelabz.Logical;

import java.util.Scanner;
public class ReverseNumber {
    public static void ReverseNum(int n) {

        int rev= 0;

        while (n!=0) {
            int remainder = n%10;
            rev = rev * 10 + remainder;
            n = n/ 10;
        }

        System.out.println("The reverse number is " + rev);
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        num = sc.nextInt();
        System.out.println("The given number is " + num);
        ReverseNum(num);
    }
}
