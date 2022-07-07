package com.bridgelabz.JunitTesting;

import java.util.Scanner;

public class Sqrt {
    static void sqrt(int c){
        double Epsilon =1E-15;
        double t=c;
        while (Math.abs(t-c/t)>Epsilon*t)
            t=(c/t+t)/2;
        System.out.println("The square root for the number is :"+t);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num= sc.nextInt();
        sqrt(num);

    }
}
