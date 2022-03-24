package com.company;
import java.util.Scanner;

public class M_19_patternOnLoop {
    public static void main(String[] args) {
//        for (int i=1;i<=4;i++){
//            for (int j=1;j<=5-i;j++){
//                System.out.printf("*");
//            }
//            System.out.printf("\n");
//        }

        //prob -2
//        System.out.println("enter the number as you want to add (even)");
//        Scanner sc = new Scanner(System.in);
//        int f = sc.nextInt();
//        int i=0;
//        int sum=0;
//        while (i<=f)
//        {
//
//            if (i%2==0)
//            {
//                sum = sum+i;
//            }
//            i++;
//        }
//        System.out.println(sum);

        //prob-3
//        System.out.println("enter the number of multiplication table of:");
//        Scanner sc = new Scanner(System.in);
//        int s1 = sc.nextInt();
//        int c;
//        for (int i=1;i<=10;i++)
//        {
//            c = s1*i;
//            System.out.printf("%d * %d =  %d\n",s1,i,c);
//        }

        //prob -4
//        System.out.println("enter the number of multiplication table of:");
//        Scanner sc = new Scanner(System.in);
//        int s1 = sc.nextInt();
//        int c;
//        for (int i=10;i>=1;i--)
//        {
//            c = s1*i;
//            System.out.printf("%d * %d =  %d\n",s1,i,c);
//        }


////        prob-5
//
//        System.out.println("Enter the number of you want to factorial");
//        Scanner sc = new Scanner(System.in);
//        int s3 = sc.nextInt();
//        int multi=1;
//        for (int i=1;i<=s3;i++)
//        {
//            multi = multi * i;
//        }
//        System.out.println(multi);

        //prob-6

//        System.out.println("Enter the number of you want to factorial");
//        Scanner sc = new Scanner(System.in);
//        int s3 = sc.nextInt();
//        int multi=1;
//        int i = 1;
//        while (i<=s3)
//        {
//            multi = multi * i;
//            i++;
//        }
//        System.out.println("using while loop " +multi);

        //prob 7
//        System.out.println("star pattern");
//        int i = 1;
//        int j =1;
//        while (j<=4)
//        {
//            while (i<=4)
//            {
//                System.out.print("*");
//                i++;
//
//            }
//            j++;
//        }

//        prob-8
        System.out.println("enter the number of multiplication table of:");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int c;
        int sum =0;
        for (int i=1;i<=10;i++)
        {
            c = s1*i;
            System.out.printf("%d * %d =  %d\n",s1,i,c);

            sum =sum+c;
        }
        System.out.println(sum);
    }
}
