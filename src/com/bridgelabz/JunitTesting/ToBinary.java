package com.bridgelabz.JunitTesting;

import java.util.Scanner;

public class ToBinary {
    static void tobinary(){
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        int b=0;
        while (n!=0)
        {
            a[b++]=n%2;
            n=n/2;
        }
        for(int i=b-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        tobinary();
    }
}
