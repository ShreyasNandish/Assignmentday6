package com.bridgelabz.JunitTesting;

import java.util.Scanner;
public class DayWeek {

    static int dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day");
        int day =sc.nextInt();
        System.out.println("Enter the month");
        int month =sc.nextInt();
        System.out.println("Enter the year");
        int yr =sc.nextInt();
        int res=dayOfWeek(day,month,yr);


        switch (res)

        {
            case 0:
                System.out.println("The given day of the date is Sunday");
                break;
            case 1:
                System.out.println("The given day of the date is Monday");
                break;
            case 2:
                System.out.println("The given day of the date is Tuesday");
                break;
            case 3:
                System.out.println("The given day of the date is Wednesday");
                break;
            case 4:
                System.out.println("The given day of the date is Thursday");
                break;
            case 5:
                System.out.println("The given day of the date is Friday");
                break;
            case 6:
                System.out.println("The given day of the date is Saturday");
                break;
            default :
                System.out.println("Not a valid day");
        }
    }
}
