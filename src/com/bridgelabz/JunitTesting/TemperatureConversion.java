package com.bridgelabz.JunitTesting;

import java.sql.SQLOutput;
import java.util.Scanner;
public class TemperatureConversion {
   static double celsius(double f)
    {

        return  (f-32)*5/9;
    }

    static double fahrenheit(double c)
    {

        return  ((9*c)/5)+32;
    }
    public static void main(String arg[])
    {
        double a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature");
        a=sc.nextDouble();

        System.out.println("******");
        System.out.println("please enter 1 for Celsius to Fahrenheit ");

        System.out.println("please enter 2 for Fahrenheit to Celsius ");

        System.out.println("******");
        int opt= sc.nextInt();
        if(opt==1)
        {
            double result=celsius(a);
            System.out.println("Celsius temperature is = "+result);
        }

        else if (opt==2)
        {
            double result1=fahrenheit(a);
            System.out.println("Fahrenheit temperature is = "+result1);
        }

        else
            System.out.println("enter  valid option ");

    }
}
