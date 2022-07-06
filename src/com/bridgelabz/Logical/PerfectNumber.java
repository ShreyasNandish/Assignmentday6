package com.bridgelabz.Logical;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args)
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number ");
        n = s.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("The number is Perfect number ");
        }
        else
        {
            System.out.println("The number is not Perfect ");
        }
    }
}
