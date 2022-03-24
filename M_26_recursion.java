package com.company;
import java.util.Scanner;

public class M_26_recursion {
    static int factorial(int a)
    {
        if (a==0 || a==1)
        {
            return 1;
        }
        else {
            return a * factorial(a-1);
        }
    }

    static int itrativefactorial(int a)
    {
        if (a==0 || a==1)
        {
            return 1;
        }
        else {
            int result = 1;
            for (int i = a; i >= 1; i--) {
                result *= i;
            }
            return result;
        }

    }
    public static void main(String[] args) {

        System.out.println("give the number of you want of factorial ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
//        int result = factorial(x);
//        System.out.println("Factorial is "+result);

        int result1 = itrativefactorial(x);
        System.out.println("Factorial is "+result1);

    }

}
