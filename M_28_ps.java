package com.company;
import java.util.Scanner;

public class M_28_ps {
//    static void multiplicationTable(int n)
//    {
//        for (int i =1;i<=10;i++)
//        {
//            System.out.printf("%d * %d = %d\n",n,i,(n*i));
//
//        }
//    }

//    static void starPrint(int n)
//    {
//        for (int i=0;i<n;i++)
//        {
//            for (int j =0;j<n+1;j++)
//            {
//                if (j<=i)
//                {
//                    System.out.print("*");
//                }
//            }
//            System.out. print("\n");
//        }
//    }

//    static int sumOfN(int n)
//    {
//        int sum = 0;
//        for (int i=0;i<=n;i++)
//        {
//            sum += i;
//        }
//        return sum;
//    }

    static void star2(int n)
    {
        for (int i=0;i<=n;i++)
        {
            for (int j =0;j<=n+1;j++)
            {
                if (j<=n-1-i)
                {
                    System.out.print("*");
                }
            }
            System.out. print("\n");
        }
    }

    static float avg(int i,int ...arr)
    {
        float sum = 0;
        float allSum;
        for (int a:arr)
        {
            sum += a;
        }
        allSum = (sum/i);
        return allSum;
    }

    static float celcioustoFERanhit(float n)
    {
        return ((n*9/5)+32);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of you want of multiplication table of");
//        int a = sc.nextInt();
//        multiplicationTable(a);

//        System.out.println("enter the number of collum you want to print a star");
//        int b = sc.nextInt();
//        starPrint(b);

//        System.out.println("enter the num of you want of sum ");
//        int c = sc.nextInt();
//        int total = sumOfN(c);
//        System.out.println(total);

//        System.out.println("enter the number of collum you want to print a star");
//        int d = sc.nextInt();
//        star2(d);

//        System.out.println("enter the number of you want of avg");
//        //int e = sc.nextInt();
//        float avge = avg(2,1,2);
//        System.out.println(avge);

        System.out.println("Enter the celcious to convert into feranhit");
        float kl = sc.nextFloat();
        float feranhit = celcioustoFERanhit(kl);
        System.out.println(feranhit);
    }
}
