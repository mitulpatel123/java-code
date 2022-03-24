package com.company;

public class M_27_fibbonacciseries {
    static int fibonacci(int n)
    {
        int a =0;
        int b =1;
        int c;
        for (int i =1;i<=n;i++)
        {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        return  0;
    }

    static int fib(int n)
    {
        if (n==1)
        {
            return 0;
        }
        else if (n==2)
        {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
//        System.out.println("enter the number");
//        int d = 4;
//        int e = fibonacci(d);
//        System.out.println(e);

        System.out.println("enter the number");
        int d = 5;
        int e = fib(d);
        System.out.println(e);

    }
}
