package com.company;
import java.util.Scanner;

public class M_18_leap_year
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check the year is leap year or not");
        int year = sc.nextInt();

        if (year%4 == 0 ){
            if (year==1900){
                System.out.println("1900 is a not a leap year");

            }
            else {
                System.out.printf("%d is a leap year",year);
            }

        }
        else if (year%100 == 0)
        {
            System.out.printf("%d is a not leap year",year);
        }
        else if (year % 400 == 0)
        {
            if (year==1900){
                System.out.println("1900 is a not a leap year");

            }
            else {
                System.out.printf("%d is a leap year",year);
            }

        }
        else {
            System.out.printf("%d is a not leap year", year);
        }
    }
}
